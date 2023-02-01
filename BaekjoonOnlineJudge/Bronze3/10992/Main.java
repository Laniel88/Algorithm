import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // N(1 ≤ N ≤ 100)

        System.out.println(" ".repeat(N-1) + "*");

        for(int i=2; i < N; i++){
            System.out.println(
                " ".repeat(N-i) +
                "*" +
                " ".repeat(2*i - 3) +
                "*"
            );
        }

        if(N != 1) System.out.println("*".repeat(2*N-1));
    }
}