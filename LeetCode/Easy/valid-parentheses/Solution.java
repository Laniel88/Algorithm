import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    private static final Map<Character, Character> parentheses;
    static {
        Map<Character, Character> mutableMap = new HashMap<>();
        mutableMap.put(')', '(');
        mutableMap.put('}', '{');
        mutableMap.put(']', '[');
        parentheses = Collections.unmodifiableMap(mutableMap);
    }
    
    public boolean isValid(String s) {
        boolean validity = true;

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char letter = s.charAt(i);
            if(letter == '(' || letter == '{' || letter == '[') {
                stack.add(letter);
            } else {
                if(stack.empty() || stack.peek() != parentheses.get(letter)){
                    validity = false;
                    break;
                }
                stack.pop();
            }
        }

        if(!stack.empty()) validity = false;

        return validity;
    }
}