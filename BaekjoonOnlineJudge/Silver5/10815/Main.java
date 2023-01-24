/*
NOTE :
 아래 코드는 성공 (binary search 후 각각 바로 결과값 출력)
 
 이 코드 이전에, result = new int[N]; 을 만들어
 0과 1값을 저장하고, for문으로 result 배열을 출력-sysout-하는 방식은 시간초과가 발생했다.

 또는 시도해보지는 않았지만, BufferedWriter를 쓰는 방법이 있을 것이다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] cardNum = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            cardNum[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cardNum);
        int M = Integer.parseInt(br.readLine());

        int[] checkNum = new int[M];
        st = new StringTokenizer(br.readLine());
        
        for(int j=0; j<M; j++) {
            checkNum[j] = Integer.parseInt(st.nextToken());
        }
        

        for(int j=0; j<M; j++){
            if(binarySearch(cardNum, checkNum[j])){
                System.out.print("1 ");
                continue;
            }
            System.out.print("0 ");
        }
        System.out.println();
    }

    public static boolean binarySearch(final int[] arr, final int value) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (arr[mid] < value) { 
                min = mid + 1;
            } else if (arr[mid] > value) { 
                max = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}