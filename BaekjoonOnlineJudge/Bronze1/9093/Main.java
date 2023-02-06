import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens())
                sb.append(reverse(st.nextToken())).append(' ');
            sb.append('\n');
        }
        System.out.print(sb);
    }
    private static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}