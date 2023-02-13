import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
        
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		for(int i = 0; i < M; i++) {
			if(Arrays.binarySearch(arr, Integer.parseInt(st.nextToken())) >= 0)
				sb.append(1).append('\n');
			else
				sb.append(0).append('\n');
		}

		System.out.println(sb);
	}
}