import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(
            fac(N) / (fac(N - K) * fac(K))
        );
    }

    private static int fac(int n) {
        if(n == 0 || n == 1)
            return 1;
        else
            return n * fac(n-1);
    }
}

/* TODO : 점화식을 이용한 재귀, DP 풀이 추가 */