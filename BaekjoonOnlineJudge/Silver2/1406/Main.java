import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Stack<Character> frontStack = new Stack<>();
        Stack<Character> backStack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        for(int i=0; i<S.length(); i++)
            frontStack.add(S.charAt(i));

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch(st.nextToken()){
                case "L":
                    if(!frontStack.isEmpty()) {
                        char temp = frontStack.pop();
                        backStack.add(temp);
                    } break;
                case "D":
                    if(!backStack.isEmpty()) {
                        char temp = backStack.pop();
                        frontStack.add(temp);
                    } break;
                case "B":
                    if(!frontStack.isEmpty())
                        frontStack.pop();
                    break;
                case "P":
                    frontStack.add(st.nextToken().charAt(0));
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!frontStack.isEmpty())
            backStack.add(frontStack.pop());
        while(!backStack.isEmpty())
            sb.append(backStack.pop());
        System.out.println(sb);
    }
}