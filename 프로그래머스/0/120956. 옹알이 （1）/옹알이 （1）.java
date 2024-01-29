import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        for (String b : babbling) {
            answer = isWord(b, words) ? answer+1 : answer;
        }
        return answer;
    }
    
    public static boolean isWord(String str, String[] words) {
        String originStr = str;
        for (String word : words) {
            if (str.length() > 0 && str.contains(word)) {
                str = str.replaceAll(word," ");
            }
        }
        if (originStr.equals(str)) return false;
            
        return str.trim().length() > 0 ? false : true;
    }
}