/* Approach : Sieve of Eratosthenes (에라토스테네스의 체) */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        } 
        Arrays.sort(arr);

        boolean[] prime = new boolean[arr[N-1]+1];
        Arrays.fill(prime, true);

        prime[0] = false;
        prime[1] = false;

        // (X) for(int i=2; i < arr[N-1]; i++)
        // 최대 수의 제곱근까지만 검사한다. (정수론)
        for(int i=2; i< Math.sqrt(arr[N-1])+1; i++){
            if(prime[i] == true) {
                for(int j=2; i*j < arr[N-1]+1; j++)
                    prime[i*j] = false;
            }
        }

        int cnt=0;
        for(int i=0; i<N; i++) {
            if(prime[arr[i]] == true) cnt++; 
        } 
        System.out.println(cnt);
    }
}