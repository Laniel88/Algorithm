import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    static final int X = 0;
    static final int Y = 1;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][X] = Integer.parseInt(st.nextToken());
            arr[i][Y] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[X] != o2[X] ? o1[X]-o2[X] : o1[Y]-o2[Y];
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++)
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
        System.out.print(sb);

    }
}