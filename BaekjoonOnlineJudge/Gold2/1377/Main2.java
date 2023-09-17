import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] arr2 = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            arr2[i] = arr[i];
        }

        Arrays.sort(arr2);

        int maxDiff = 0;
        for(int i=0; i< N; i++) { // arr (정렬 전)
            for(int j=0; j<N; j++) { // arr2 (정렬 후)
                if(arr[i] == arr2[j]) {
                    maxDiff = Math.max(maxDiff, i-j);
                    break;
                }
            }
        }
        System.out.println(maxDiff+1);
    }
}