/* TODO : review code */
/* NOTE : 나머지 연산 분배 법칙  (A+B)%M = ( (A%M) + (B%M) ) % M  -> 즉, mod 연산 활용 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        final int birth = 20000303;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int current = 0;
        for (int i = 0; i < N.length(); i++) {
            current *= 10;
            current += Character.getNumericValue(N.charAt(i));
            current %= birth;
        }
        System.out.println(current);
    }
}