/* BFS 사용 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int vertex;    
    static int edge;
    
    static boolean[][] graph;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        vertex = Integer.parseInt(br.readLine());
        edge = Integer.parseInt(br.readLine());

        graph = new boolean[vertex][vertex];
        for(int i=0; i<edge; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            graph[a][b] = graph[b][a] = true;
        }

        System.out.println(bfs());
    }

    private static int bfs() {
        int cnt=0;

        Queue<Integer> queue = new LinkedList<>();
        boolean[] checked = new boolean[vertex];

        queue.add(0);
        checked[0] = true;

        while(!queue.isEmpty()) {
            int temp = queue.poll();
            for(int i=0; i<vertex; i++) {
                if(graph[temp][i] && !checked[i]) {
                    queue.add(i);
                    checked[i] = true;
                    cnt++;
                }
            }
        }

        return cnt;
    }
}