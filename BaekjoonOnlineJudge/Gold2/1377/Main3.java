/* 시간초과 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N+1];
        for(int i=1; i<=N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        boolean changed = false;
        for(int i=1; i<=N+1; i++) {
            changed = false;
            for(int j=1; j<N-i; j++) {
                if(arr[j] > arr[j+1]) {
                    changed = true;
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            if(changed == false) {
                System.out.println(i);
                break;
            }
        }
    }
}