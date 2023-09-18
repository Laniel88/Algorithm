/* Approach : Radix Sort */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        for(int i=0; i<N; i++)
            arr[i] = Integer.parseInt(br.readLine());
        br.close();
    
        radixSort(arr);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++)
            sb.append(arr[i]).append('\n');
        System.out.print(sb);
    }
    public static void radixSort(int[] arr) {
        // int max = getMax(arr);
    
        // for (int exp = 1; max / exp > 0; exp *= 10) {
        for (int exp = 1; exp <= 10000; exp *= 10) {
            countSort(arr, exp);
        }
    }
    
    private static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10]; // 0 ~ 9
    
        // Count the occurrences of each digit
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }
        // Make count cumulatively
        for (int i = 1; i < 10; i++) { 
            count[i] += count[i - 1];
        }
    
        // Build output
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
    
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    
    // private static int getMax(int[] arr) {
    //     int max = arr[0];
    //     for (int i = 1; i < arr.length; i++)
    //         Math.max(max, arr[i]);
    //     return max;
    // }
    
}

