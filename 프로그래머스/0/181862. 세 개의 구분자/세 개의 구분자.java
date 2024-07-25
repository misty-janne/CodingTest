import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] sarr = myStr.split("a|b|c");        
        String[] answer = {};
        for (String s : sarr) {
            if (!s.equals("")) {
                String[] arr = Arrays.copyOf(answer, answer.length+1);
                arr[answer.length] = s;
                answer = arr;
            }
        }
        
        return answer.length == 0 ? new String[]{"EMPTY"} : answer;
    }
}