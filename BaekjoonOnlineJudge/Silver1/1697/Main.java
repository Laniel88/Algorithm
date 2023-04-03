/* TODO : review code */

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
        int K = Integer.parseInt(st.nextToken());
    
        int[] count = new int[100001];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);

        if(N == K) { 
            System.out.println(0);
            return; 
        } 

        while(!queue.isEmpty()) {
            int current = queue.poll();

            for(int i=0; i<3; i++) {
                int next = move(current, i);

                if(next < 0 || next > 100000 || count[next] != 0)
                    continue;

                if(next == K) {
                    System.out.println(count[current] + 1);
                    return;
                }

                queue.add(next);
                count[next] = count[current] + 1;
            }
        }
    }

    private static int move(int current, int type) {
        if (type == 0)
            return current + 1;
        else if (type == 1)
            return current - 1;
        else
            return current * 2;
    }
}