import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    static int vertex, edge, start;

    static boolean[][] graph;
    static boolean[] checked;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        vertex = Integer.parseInt(st.nextToken());
        edge   = Integer.parseInt(st.nextToken());
        start  = Integer.parseInt(st.nextToken()) - 1;

        graph = new boolean[vertex][vertex];
        
        for(int i=0; i<edge; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a-1][b-1] = graph[b-1][a-1] = true; //https://www.youtube.com/watch?v=QSsjB1tMPhA
        }

        checked = new boolean[vertex];
        dfs(start);
        sb.append('\n');

        checked = new boolean[vertex];
        bfs(start);

        System.out.println(sb);

    }

    private static void dfs(int start) {
        checked[start] = true;
        sb.append(start+1).append(' ');

        for(int i=0; i<vertex; i++) {
            if(graph[start][i] && !checked[i])
                dfs(i);
        }
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        checked[start] = true;

        while(!queue.isEmpty()) {
            int temp = queue.poll();
            sb.append(temp+1).append(' ');
            
            for(int i=0; i<vertex; i++) {
                if(graph[temp][i] && !checked[i]) {
                    queue.add(i);
                    checked[i] = true;
                }
            }
        }
    }
}