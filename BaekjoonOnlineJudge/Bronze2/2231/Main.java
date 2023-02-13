import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int result = 0;

        for(int i=N-9*len(N); i<N; i++) {
            int tempNum=i, tempSum=i;

            // 자릿수 더하기
            while(tempNum != 0) {
                tempSum += tempNum%10;
                tempNum /= 10;
            }

            if(tempSum == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }

    private static int len(int n) {
        return (int)(Math.log10(n) + 1);
    }
}