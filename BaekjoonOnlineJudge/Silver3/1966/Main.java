import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        for(int i=0; i<C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(
                printer(N, M, new StringTokenizer(br.readLine()))
            ).append('\n');
        }

        System.out.print(sb);
    }

    private static int printer(int N, int M, StringTokenizer documents) {
        ArrayList<Integer> queue = new ArrayList<>();
        for(int i=0; i<N; i++) queue.add(Integer.parseInt(documents.nextToken()));

        int target=M, cnt=0;    // target 변수로 위치 추적, cnt 변수로 출력 횟수 카운팅
        while(true) {   
            if(isImportant(queue.get(0), queue)) {
                queue.remove(0);
                cnt++;
                if(target == 0) break;   // 대상 출력
                else target--;
            } else {
                int temp = queue.remove(0);
                queue.add(temp);

                if(target == 0) target = queue.size()-1;
                else target--;
            }
        }
        return cnt;
    }

    private static boolean isImportant(int targetPriority, ArrayList<Integer> queue) {
        boolean result = true;
        for(int i=0; i<queue.size(); i++) {
            if(targetPriority < queue.get(i)) {
                result = false;
                break;
            }
        }
        return result;
    }
}