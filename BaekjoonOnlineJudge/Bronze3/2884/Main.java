import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        minute -= 45;

        if(minute < 0) {
            minute += 60;
            hour--;
        }

        if(hour < 0)
            hour = 23;
        else if(hour > 23)
            hour = 0;

        System.out.println(String.format("%d %d", hour, minute));
    }
}