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

        int [] DP = new int[N+1]; // DP[i] : i일부터 N-1일까지 Max P_i  (N-1일 계산시 필요한 DP[N] 값을 위해 length를 N+1로 조정)
        for(int i=N-1; i>=0; i--) {
            if(consult[i][T] + i > N)
                DP[i] = DP[i+1];
            else
                DP[i] = Math.max(DP[i+1], consult[i][P] + DP[i + consult[i][T]]);
        }
        System.out.println(DP[0]);
    }

}