import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int[] nums = new int[10];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String result = Integer.toString(A*B*C);
        for(int i=0; i<result.length(); i++) {
            nums[result.charAt(i) - '0']++;
        }

        for(int i=0; i<10; i++) {
            System.out.println(nums[i]);
        }
    }
}