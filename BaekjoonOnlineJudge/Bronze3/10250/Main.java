import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());


        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W  = Integer.parseInt(st.nextToken());
            int N  = Integer.parseInt(st.nextToken());
            sb.append(room(H, W, N)).append('\n');
        }

        System.out.print(sb);
    }

    private static int room(int H, int W, int N) {
        int Y = N%H != 0 ? N%H:H; 
        int X = N%H != 0 ? N/H + 1:N/H; 
   
        return Y * 100 + X;
    }
}