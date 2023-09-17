/* 시간초과 : for문을 통한 모든 경우 탐색  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3 {
        public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] cardNum = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            cardNum[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());

        int[] checkNum = new int[M], result = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int j=0; j<M; j++) {
            checkNum[j] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(result[j] == 1) continue;   // 이미 가지고 있는 카드의 숫자
                if(cardNum[i] == checkNum[j]){
                    result[j] = 1;
                    break;
                }
            }
        } 

        for(int j=0; j<M; j++){
            System.out.print(result[j]);
            System.out.print(" ");
        }
        System.out.println();
    }
}