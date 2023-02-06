import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
NOTE : 원본 코드 (https://github.com/Laniel88/Algorithm/tree/main/Algorithmic-Problem-Solving-Strategies/BRACKETS2)
*/

public class Main {
    private static final Map<Character, Character> parentheses;
    static {
        Map<Character, Character> mutableMap = new HashMap<>();
        mutableMap.put(')', '(');
        parentheses = Collections.unmodifiableMap(mutableMap);
    }
    
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++)
            sb.append(isValid(br.readLine()) ? "YES":"NO").append('\n');

        System.out.print(sb);
    }

    private static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();

        for(int j=0; j<str.length(); j++) {
            char letter = str.charAt(j);
            if(letter == '(') {
                stack.add(letter);
            } else {
                if(stack.empty() || stack.peek() != parentheses.get(letter))
                    return false;
                stack.pop();
            }
        }
        if(!stack.empty()) return false;
        else return true;
    }
}