/* TODO : review code */
/* NOTE : DFS로 하면 시간초과 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] maze = new int[N][M];
        boolean[][] check = new boolean[N][M];
        for(int i=0; i<N; i++) {
            String line = br.readLine();
            for(int j=0; j<M; j++)
                maze[i][j] = line.charAt(j) == '1' ? 1:0;
        }
        
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0,0));
        
        while(!queue.isEmpty()) {
            Point currentP = queue.poll();
            for(int i=0; i<4; i++) {
                Point nextP = move(currentP, i);

                if(nextP.x < 0 || nextP.y < 0 || nextP.x > N-1 || nextP.y > M-1)
                    continue;
                if(check[nextP.x][nextP.y] || maze[nextP.x][nextP.y] == 0)
                    continue;
                
                maze[nextP.x][nextP.y] = maze[currentP.x][currentP.y] + 1;
                check[nextP.x][nextP.y] = true;
                queue.add(nextP);
            }
        }
        System.out.println(maze[N-1][M-1]);
    }

    private static Point move(Point point, int type) {
        if(type == 0)
            return new Point(point.x+1, point.y);
        else if(type == 1)
            return new Point(point.x-1, point.y);
        else if(type == 2)
            return new Point(point.x, point.y+1);
        else
            return new Point(point.x, point.y-1);
        
    }
}

class Point {
    int x,y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}