import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        Integer[] arr = new Integer[input.length()];
        for(int i=0; i<input.length(); i++) {
            arr[i] = Character.getNumericValue(input.charAt(i));
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i : arr) {
            System.out.print(i);
        }
        System.out.println();
    }
}