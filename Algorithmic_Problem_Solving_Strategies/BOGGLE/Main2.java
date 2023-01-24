package BOGGLE;

/* 6장 기준 - 완전 탐색 */
// TODO : unfinished

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine()); // 테스트 케이스 수 <= 50
        StringTokenizer st;

        int[][][] boggle = new int[C][5][5];

        for(int i=0; i<C; i++){
            for(int j=0; j<5; j++){
                st = new StringTokenizer(br.readLine());
                String line = st.nextToken();
            }
        }

        int N = Integer.parseInt(br.readLine()); // 테스트 케이스 수 <= 50
    }
}
