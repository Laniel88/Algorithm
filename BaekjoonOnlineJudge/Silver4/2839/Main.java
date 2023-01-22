import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int i, j, result = -1; // i : 5kg, j : 3kg 

        for(i= N/5; i >= 0; i-- ) {
            if( (N - i * 5)%3 == 0){
                j = (N - i * 5) / 3;
                result = i + j;
                break;
            } 
        }
        System.out.println(result);
    }
}