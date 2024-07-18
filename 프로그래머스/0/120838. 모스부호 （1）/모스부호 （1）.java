import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] m = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String, Character> morses = new HashMap<>();
        int i = 0;
        for (char c = 'a'; c <= 'z'; c++, i++) {
            morses.put(m[i],c);
        }
                
        for (String s : letter.split(" ")) {
            answer += morses.get(s);
        }
        return answer;
    }
    
}