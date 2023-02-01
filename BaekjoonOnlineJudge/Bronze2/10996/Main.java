import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if(N==1) { System.out.println("*"); return; }

        for(int i=0; i<N*2; i++) {
            if(i%2==0)
                System.out.println("*" + " *".repeat(N%2==0 ? N/2-1 : (N-1)/2));
            else
                System.out.println(" *".repeat(N%2==0 ? N/2 : (N-1)/2));
        }
    }
}