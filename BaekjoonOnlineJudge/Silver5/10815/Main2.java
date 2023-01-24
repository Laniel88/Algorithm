/* TODO :  unfinished - 직접구현한 탐색메소드가 아닌, Java.util.Arrays의 BinarySearch 메소드를 이용해서 빠르게 답을 구해본다. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
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
            // CODE
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