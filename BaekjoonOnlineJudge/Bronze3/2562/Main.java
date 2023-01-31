import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[9];
        int max = 0;
        
        for(int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] > arr[max]) max = i;
        }

        System.out.println(arr[max]);
        System.out.println(max + 1);

    }
}