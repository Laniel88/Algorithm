import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        final int ROW = 4*N-3;

        if(N == 1) { System.out.println("*"); return; }

        // 상부 : 2*N-2 lines (중간 줄 포함 X)
        for(int i=2*N-2; i>0; i--) {
            if(i%2 ==0) {
                System.out.print("* ".repeat((ROW-1)/4 - i/2));
                System.out.print("*".repeat(2 * i + 1));
                System.out.println(" *".repeat((ROW-1)/4 - i/2));
            } else {
                System.out.print("* ".repeat((ROW-1)/4 - (i-1)/2));
                System.out.print(" ".repeat(2 * i - 1));
                System.out.println(" *".repeat((ROW-1)/4 - (i-1)/2));
            }
        }
        // 하부 : 2*N-1 lines (중간 줄 포함 O)
        for(int i=0; i< 2*N-1; i++) {
            if(i%2 ==0) {
                System.out.print("* ".repeat((ROW-1)/4 - i/2));
                System.out.print("*".repeat(2 * i + 1));
                System.out.println(" *".repeat((ROW-1)/4 - i/2));
            } else {
                System.out.print("* ".repeat((ROW-1)/4 - (i-1)/2));
                System.out.print(" ".repeat(2 * i - 1));
                System.out.println(" *".repeat((ROW-1)/4 - (i-1)/2));
            }
        }

    }
}