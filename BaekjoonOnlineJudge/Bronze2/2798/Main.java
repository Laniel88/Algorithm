import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int max = 0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i=0; i<N-2; i++) {
            if(arr[i]*3 > M) break;
            
            for(int j=i+1; j<N-1; j++) {
                if(arr[i] + arr[j]*2 > M) break;

                for(int k=j+1; k<N; k++) {
                    if(arr[i] + arr[j] + arr[k] > M) break;
                    
                    max = Math.max(arr[i] + arr[j] + arr[k], max);
                }
            }
        }

        System.out.println(max);
    }
}