/* TODO : review code, could be improved */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        // Arrays.sort(arr); -> 시간초과
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for(int i : list) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}