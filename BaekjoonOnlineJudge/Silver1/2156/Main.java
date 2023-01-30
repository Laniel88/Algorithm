import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] wines = new int[N];

        for(int i=0; i<N; i++)
            wines[i] = Integer.parseInt(br.readLine());

        int[] DP = new int[N];

        DP[0] = wines[0];
        if(N > 1) DP[1] = wines[0] + wines[1];
        if(N > 2) DP[2] = ternaryMax(DP[1], wines[1] + wines[2], wines[0] + wines[2]);

        for(int i=3; i<N; i++){
            DP[i] = ternaryMax(
                    DP[i-1],
                    DP[i-2] + wines[i], 
                    DP[i-3] + wines[i-1] + wines[i]
                );
        }
        System.out.println(DP[N-1]);
    }

    private static int ternaryMax(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }
}

/* TODO : review code */