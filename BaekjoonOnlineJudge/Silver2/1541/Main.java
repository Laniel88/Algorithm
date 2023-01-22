// TODO : review code

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = br.readLine();
        
        String[] additions = inputLine.split("-");
        

        String[] numbers;
        int result = 0, temp;

        for(int i=0; i < additions.length; i++){
            temp = 0;
            // NOTE : +, *, ^, [, ], (, ) 등은 \\로 PatterSyntaxExcpetion 해결
            numbers = additions[i].split("\\+"); 

            for(int j=0; j<numbers.length; j++){
                temp += Integer.parseInt(numbers[j]);
            }

            if(i == 0)
                result += temp;
            else
                result -= temp;
        }
        
        System.out.println(result);
    }
}