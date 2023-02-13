import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int gcd = A > B ? gcd(A,B):gcd(B,A);

        System.out.println(gcd);
        System.out.println(A*B/gcd);
    }

    // NOTE : 유클리드 호제법
    public static int gcd(int A, int B) {
        if(A%B == 0)
            return B;
        else
            return gcd(B, A%B);
    }
}