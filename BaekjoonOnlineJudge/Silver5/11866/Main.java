import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> soldiers = new LinkedList<>();
        for(int i=0; i<N; i++) {
            soldiers.add(i+1);
        }

        while(soldiers.size() > 1) {
            for(int i=0; i<K-1; i++) {
                int temp = soldiers.poll();
                soldiers.add(temp);
            }
            sb.append(soldiers.poll()).append(", ");
        }
        sb.append(soldiers.poll()).append(">");
        System.out.println(sb);
    }

}