import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        for(int i=0; i<C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            josephus(N, K);
        }
        System.out.print(sb);
    }

    /* Approach : Queue */
    private static void josephus(int N, int K) {
        Queue<Integer> soldiers = new LinkedList<>();
        for(int i=0; i<N; i++) {
            soldiers.add(i+1);
        }
        soldiers.poll();
        while(soldiers.size() > 2) {
            for(int i=0; i<K-1; i++) {
                int temp = soldiers.poll();
                soldiers.add(temp);
            }
            soldiers.poll();
        }
        int P1 = soldiers.poll(), P2 = soldiers.poll();
        sb.append(
            P1 < P2 ?
            String.format("%d %d\n", P1, P2) : String.format("%d %d\n", P2, P1)
        );
    }
}