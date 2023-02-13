import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            for(int i=0; i<3; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            if(arr[0] == 0) break;

            Arrays.sort(arr);
            
            if(Math.pow(arr[0],2) + Math.pow(arr[1],2) == Math.pow(arr[2],2))
                sb.append("right").append('\n');
            else
                sb.append("wrong").append('\n');
        }

        System.out.print(sb);

    }
}