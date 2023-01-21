import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int newNum = N, cnt = 0;

        do {
            newNum = makeNewNum(newNum);
            cnt++;
        } while(newNum != N);

        System.out.println(cnt);
    }

    public static int makeNewNum(int num){
        if(num < 10) {
            return num * 11;
        } else {
            int tensDigit = num / 10;
            int onesDigit = num % 10;
            return onesDigit * 10 + (tensDigit + onesDigit) % 10;
        }
    }
}
