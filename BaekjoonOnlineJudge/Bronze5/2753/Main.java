import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean isLeap = false;
        if(N % 4 == 0 && N % 100 != 0) isLeap = true;
        else if(N % 400 == 0) isLeap = true;
        System.out.println(isLeap ? 1 : 0);
    }
}