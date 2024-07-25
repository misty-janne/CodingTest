import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        while (s.length() > 0) {
            int cnt = 0;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(0) == s.charAt(i)) cnt++;
            }
            if (cnt == 0) answer += s.charAt(0);
            s = s.replaceAll(s.charAt(0)+"","");
        }
        char[] carr = answer.toCharArray();
        Arrays.sort(carr);
        return new String(carr);
    }
}