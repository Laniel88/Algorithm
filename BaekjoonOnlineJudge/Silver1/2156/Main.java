// TODO : unfinished

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    final static int select_true = 1;
    final static int select_false = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] wines = new int[N];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            wines[i] = Integer.parseInt(st.nextToken());
        }
        
        int[][] DP = new int[N][2];

        DP[0][0] = 6;
        DP[0][1] = 6;
        DP[1][0] = 6;
        DP[1][1] = 16;

        for(int i=2; i<N; i++) {
            DP[i][0] = Math.max(
                            Math.max(wines[i-1], wines[i-2]) + wines[i], 
                            wines[i-1] + wines[i-2]
                        );
            System.out.println(String.format("wines[%d] : %d", i, wines[i]));
        }

        System.out.println(Math.max(wines[N-1], wines[N-2]));

    }
}

/*

 6  6
 10 16
 13 23
 9  
 8
 1

답 : 23
 */