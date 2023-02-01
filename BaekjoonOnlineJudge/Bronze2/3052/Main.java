import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for(int i=0; i<10; i++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }
        Arrays.sort(arr);

        int cnt=0;
        for(int i=0; i<10; i++) {
            if(i>0 && arr[i] == arr[i-1]) continue;
            cnt++;
        }
        System.out.println(cnt);
    }
}