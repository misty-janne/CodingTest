import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Arrays.fill(answer,-1);
        for (int i = 1; i < s.length(); i++) {
            if(s.substring(0,i).indexOf(s.substring(i,i+1)) > -1) {
                answer[i] = s.substring(0,i+1).lastIndexOf(s.substring(i,i+1))
                    - s.substring(0,i).lastIndexOf(s.substring(i,i+1));
            }
        }
        return answer;
    }
}