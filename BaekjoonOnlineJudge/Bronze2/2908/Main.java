import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb;

        sb = new StringBuffer(st.nextToken());
        int A = Integer.parseInt(sb.reverse().toString());

        sb = new StringBuffer(st.nextToken());
        int B = Integer.parseInt(sb.reverse().toString());

        System.out.println(A>B ? A : B);
    }
}