import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<N; i++){
            System.out.println("*".repeat(i));
        }
        for(int i=N; i>0; i--){
            System.out.println("*".repeat(i));
        }
    }
}