import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 큐의 크기
        int M = Integer.parseInt(st.nextToken());   // 뽑아내려고 하는 개수
        ArrayList<Integer> queue = new ArrayList<>(); // 큐, 초기화를 위해 리스트 사용
        for(int i=0; i<N; i++)
            queue.add(-1);
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++)
            queue.set(Integer.parseInt(st.nextToken())-1, i);
        
        int cnt=0;
        for(int i=0; i<M; i++) {
            // 2번 연산과 3번 연산 중 최소 연산 찾기
            // - 큐의 크기가 짝수 : size/2 까지 가능 (size/2에서 같아짐)
            // - 큐의 크기가 홀수 : (size-1)/2 까지 가능
            boolean isCal2 = queue.indexOf(i) <= (int) queue.size()/2 ? true:false;

            if(isCal2) {
                while(queue.get(0) != i) {
                    int temp = queue.remove(0);
                    queue.add(temp);
                    cnt++;
                }
            } else {
                while(queue.get(0) != i) {
                    int temp = queue.remove(queue.size()-1);
                    queue.add(0, temp);
                    cnt++;
                }
            }
            queue.remove(0);
        }
        System.out.println(cnt);
    }
}