import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String N = br.readLine();
            if(N.equals("0")) break;
            
            boolean valid = true;
            for(int i=0; i< N.length()/2; i++) {
                if(N.charAt(i) != N.charAt(N.length()-i-1)) {
                    valid = false;
                    break;
                }
            }
            sb.append(valid ? "yes":"no").append('\n');
        }
        System.out.print(sb);
    }
}