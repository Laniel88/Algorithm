/* TODO : review code */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int[] numbers = new int[20000001];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N; i++)
			numbers[Integer.parseInt(st.nextToken()) + 10000000]++;
		
		int M = Integer.parseInt(br.readLine());

	    st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++)
			sb.append(numbers[Integer.parseInt(st.nextToken()) + 10000000]).append(' ');

		System.out.println(sb);
	}
}