/* Approach : brute force */
/* NOTE : Brute force 말고 다른 방법이 있는가? */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String currentNum = "";

        for(int num=0, cnt=0; cnt<N ;num++){
            currentNum = Integer.toString(num);
            for(int i=0; i<currentNum.length()-2; i++){
                if(
                    currentNum.charAt(i) == '6' &&
                    currentNum.charAt(i+1) == '6' &&
                    currentNum.charAt(i+2) == '6' 
                ) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(currentNum);
    }
}