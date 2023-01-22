/* Solution using DP */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    final static int R = 0;
    final static int G = 1;
    final static int B = 2;

    static int[][] costs;
    static int[][] DP;
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        costs = new int[N][3];
        DP = new int[N][3];
        for(int i=0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            costs[i][R] = Integer.parseInt(st.nextToken());
            costs[i][G] = Integer.parseInt(st.nextToken());
            costs[i][B] = Integer.parseInt(st.nextToken());
        }

        DP[0] = costs[0];
        
        System.out.println(
            Math.min(
            Math.min(
                calculateMin(N-1, R),
                calculateMin(N-1, G)),
                calculateMin(N-1, B)
            )
        );
        
    }

    private static int calculateMin(int N, int rgb){
        if(DP[N][rgb] == 0) {
            switch(rgb){
                case R: DP[N][rgb] = Math.min(
                                        calculateMin(N-1, G),
                                        calculateMin(N-1, B)
                                    ) + costs[N][R]; break;
                case G: DP[N][rgb] = Math.min(
                                        calculateMin(N-1, R),
                                        calculateMin(N-1, B)
                                    ) + costs[N][G]; break;
                case B: DP[N][rgb] = Math.min(
                                        calculateMin(N-1, R),
                                        calculateMin(N-1, G)
                                    ) + costs[N][B]; break;
            }
        }
        return DP[N][rgb];
    }
}