// TODO : could be imporved using dp

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(calculate(N, 0));
    }

    private static int calculate(int N, int cnt) {
        if(N == 0 || N == 1) 
            return cnt;
        else 
            return Math.min(
                calculate(N/2, cnt + 1 + N%2),
                calculate(N/3, cnt + 1 + N%3)
                );
    }
}