import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] meetingInfo = new int[N][2]; 
        for(int i=0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            meetingInfo[i][0] = Integer.parseInt(st.nextToken());
            meetingInfo[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(meetingInfo, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) 
                    return o1[0] - o2[0];
                
                return o1[1] - o2[1];
            }
        });
        
        int cnt = 1, validMeetingIndex = 0;

        for(int i = 1; i < N; i++) {
            if(meetingInfo[validMeetingIndex][1] <= meetingInfo[i][0]){
                validMeetingIndex = i;
                cnt++;
            }
        }
        System.out.println(cnt);
    }   
}
