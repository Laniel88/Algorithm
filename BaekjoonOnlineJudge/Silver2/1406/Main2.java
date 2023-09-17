/* 시간초과 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int N = Integer.parseInt(br.readLine());
        int cursor = S.length();
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch(st.nextToken()){
                case "L":
                    if(cursor != 0)
                        cursor--;
                    break;
                case "D":
                    if(cursor != S.length())
                        cursor++;
                    break;
                case "B":
                    if(cursor != 0) {
                        S = S.substring(0, cursor-1) + S.substring(cursor,S.length());
                        cursor--;
                    }
                    break;
                case "P":
                    if(cursor != 0) {
                        S = S.substring(0, cursor) + st.nextToken() + S.substring(cursor, S.length());
                        cursor++;
                    }
            }
        }
        System.out.println(S);
    }
}