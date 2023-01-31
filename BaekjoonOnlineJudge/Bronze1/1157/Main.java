/* TODO : could be improved */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();

        int[] alphabet = new int[26];

        for(int i=0; i<word.length(); i++) {
            int letter = word.charAt(i) - 65;
            alphabet[letter]++;
        }

        int max = 0;
        boolean overlap = false;
        for(int i=1; i<26; i++) {
            if(alphabet[i] > alphabet[max]){
                overlap = false;
                max = i;
            } else if(alphabet[i] == alphabet[max]) {
                overlap = true;
            }
        }

        if(overlap == true){
            System.out.println("?");
        } else {
            System.out.println((char)(max + 65));
        }

    }
}