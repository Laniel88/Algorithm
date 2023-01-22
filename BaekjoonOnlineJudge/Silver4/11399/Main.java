import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] timeArray = new int[N];
        for(int i=0; i < N; i++)
            timeArray[i] = Integer.parseInt(st.nextToken());
        
        for(int i=1; i < timeArray.length; i++){
            for(int j=i ; j > 0; j--){
                if(timeArray[j] < timeArray[j-1]){
                    int tmp = timeArray[j];
                    timeArray[j] = timeArray[j-1];
                    timeArray[j-1] = tmp;
                } else break;
            }
        }
        
        int timeCnt = 0;
        for(int i=0; i < N; i++){
            timeCnt += timeArray[i] * (N - i);
        }
        System.out.println(timeCnt);
    }
}
