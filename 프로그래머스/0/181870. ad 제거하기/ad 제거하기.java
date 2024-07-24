import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        for (String str : strArr) {
            if (!str.contains("ad")) {
                String[] arr = Arrays.copyOf(answer, answer.length+1);
                arr[answer.length] = str;
                answer =  arr;
            }
        }
        return answer;
    }
}