import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        /* NOTE : `==` 연산자를 사용할 경우 올바른 결과가 나오지 않음(equlas 사용) */
        /* TODO : review code */
        if(line.equals("1 2 3 4 5 6 7 8")) {
            System.out.println("ascending");
        } else if(line.equals("8 7 6 5 4 3 2 1")) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}