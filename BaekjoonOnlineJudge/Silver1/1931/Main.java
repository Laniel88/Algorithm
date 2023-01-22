// WORKING ON 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

        // 회의 종료 시간 기준 정렬
        for(int i=1; i < meetingInfo.length; i++){
            for(int j=i ; j > 0; j--){
                if(meetingInfo[j][1] < meetingInfo[j-1][1]){
                    int[] tmp = meetingInfo[j];
                    meetingInfo[j] = meetingInfo[j-1];
                    meetingInfo[j-1] = tmp;
                } else if(meetingInfo[j][0] == meetingInfo[j-1][0]){
                    
                } else break;
            }
        }

        int start = 0;
        
        while(true) {
            int minEndIndex = start;
            for(int i = start + 1; i < N; i++) {

                if(meetingInfo[i][1] < meetingInfo[minEndIndex][1])
                    minEndIndex = i;
            }
            
        }

    }   
}
