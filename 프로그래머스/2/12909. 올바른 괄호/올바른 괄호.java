import java.util.*;

class Solution {
    boolean solution(String s) {

        char[] sc = s.toCharArray();
        
        if (sc[0] == ')') return false;
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < sc.length; i++) {
            if (sc[i] == '(') {
                stack.push(i);
            } else if (sc[i] == ')' && !stack.isEmpty()) {
                sc[i] = ' ';
                sc[stack.pop()] = ' ';
            }
        }
        
        return new String(sc).contains("(") || new String(sc).trim().length() > 0 ? false : true;
    }
}