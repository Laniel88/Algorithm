/* TODO : unfinished */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        final int T = 0;
        final int P = 1;        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        
        int [][] consult = new int[N][2];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            consult[i][T] = Integer.parseInt(st.nextToken());
            consult[i][P] = Integer.parseInt(st.nextToken());
        }

        int [] DP = new int[N]; // DP[i] : i일까지의 최대값
        for(int i=0; i<N; i++) {
            if(consult[i][T] + i < N){
                DP[i] = Math.max(DP[i], DP[i-1]);
            } else{
                DP[consult[i][T] + i] = Math.max(DP[consult[i][T] + i], DP[i]+ consult[i][P]);
            }
        }
        System.out.println(DP[N-1]);
    }

}