/* NOTE : 스택 문제라는데 딱히 스택을 쓸 필요가 없어 보여 내 생각대로 풀었다 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int piece = 0;

        for(int i=0, bar=0; i<S.length(); i++) {
            if(S.charAt(i) == '(') {
                bar++;
            } else {
                if(S.charAt(i-1) == '(') {
                    piece += --bar;
                }
                else {
                    piece++;
                    bar--;
                }
            }
        }

        System.out.println(piece);
    }
}