import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        if(calculate(arr, N)) System.out.print(sb);
        else System.out.println("NO");
    }

    private static boolean calculate(int[] arr, int N) {
        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        sb.append("+\n");

        for(int i=0, num = 1; i<N; i++) {
            // 스택이 비어 있는 경우도 고려해야함.
            while(stack.isEmpty() || stack.peek() != arr[i]){
                if(stack.isEmpty() || stack.peek() < arr[i]) {
                    stack.add(++num); 
                    sb.append("+\n");
                } else {
                    return false;
                }
            }
            stack.pop();
            sb.append("-\n");
        }
        return true;
    }
}