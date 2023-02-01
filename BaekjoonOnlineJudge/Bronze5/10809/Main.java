import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        for(int i=0; i< S.length(); i++){
            if(alphabet[S.charAt(i)-97] == -1)
                alphabet[S.charAt(i)-97] = i;
        }
        for(int i=0; i< 26; i++){
            System.out.print(String.format("%d ", alphabet[i]));
        }
        System.out.println();
    }
}