import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println("*".repeat(N) + " ".repeat(2*N - 3) + "*".repeat(N));
        for(int i=1; i<N-1; i++) {
            System.out.print(" ".repeat(i));
            System.out.print("*" + " ".repeat(N-2) + "*");
            System.out.print(" ".repeat( 2 * N - 3 - 2 * i));
            System.out.print("*" + " ".repeat(N-2) + "*\n");
        }
        System.out.println(" ".repeat(N-1) + "*" + " ".repeat(N-2) + "*" + " ".repeat(N-2) + "*");
        for(int i=N-2; i>0; i--) {
            System.out.print(" ".repeat(i));
            System.out.print("*" + " ".repeat(N-2) + "*");
            System.out.print(" ".repeat( 2 * N - 3 - 2 * i));
            System.out.print("*" + " ".repeat(N-2) + "*\n");
        }
        System.out.println("*".repeat(N) + " ".repeat(2*N - 3) + "*".repeat(N));
        
    }
}

