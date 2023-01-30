import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int cntRecursion = 0;
    static int cntDp = 0;

    static int[] Fibo;
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Fibo = new int[N];

        fiboRecursion(N);
        fiboDp(N);

        System.out.println(String.format("%d %d",cntRecursion, cntDp));
    }

    private static int fiboRecursion(int n){
        if(n == 1 || n == 2){
            cntRecursion++;
            return 1;
        }
        return fiboRecursion(n-1) + fiboRecursion(n-2);
    }

    private static int fiboDp(int n){
        // 5 <= n <= 40
        Fibo[0] = 1;
        Fibo[1] = 1;
        for(int i=2; i< n; i++){
            cntDp ++;
            Fibo[i] = Fibo[i-1] + Fibo[i-2];
        }
        return Fibo[n-1];
    }
}