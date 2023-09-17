import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrData[] arr = new ArrData[N];
        for(int i=0; i<N; i++) {
            arr[i] = new ArrData(i, Integer.parseInt(br.readLine()));
        }

        Arrays.sort(arr);

        int maxDiff = 0;
        for(int i=0; i<N; i++) {
            maxDiff = Math.max(maxDiff, arr[i].index - i);
        }
        System.out.println(maxDiff+1);
    }
}

class ArrData implements Comparable<ArrData> {
    int index;
    int value;

    public ArrData(int index, int value) {
        this.index = index;
        this.value = value;
    }

    @Override
    public int compareTo(ArrData a) {
        return this.value - a.value;
    }
}