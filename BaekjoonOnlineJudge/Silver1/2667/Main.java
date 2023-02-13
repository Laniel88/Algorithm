import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static int N;
    static boolean[][] map;

    static int cnt;
    public static void main(String[] args) throws NumberFormatException, IOException {
        ArrayList<Integer> result = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new boolean[N][N];

        for(int i=0; i<N; i++) {
            String line =  br.readLine();
            for(int j=0; j<N; j++) {
                if(line.charAt(j) == '0')
                    map[i][j] = false;
                else
                    map[i][j] = true;
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(map[i][j]){
                    cnt=0;
                    search(i,j);
                    result.add(cnt);
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for(int i=0; i<result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    private static void search(int i, int j) {
        if(!map[i][j]) return;
        
        cnt++;
        map[i][j] = false;

        if(i < N-1) search(i+1, j);
        if(i > 0) search(i-1, j);
        if(j < N-1) search(i, j+1);
        if(j > 0)  search(i, j-1);
    }
}