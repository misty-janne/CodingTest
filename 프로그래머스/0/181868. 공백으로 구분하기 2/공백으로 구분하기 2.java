import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        String[] sarr = my_string.split(" ");
        for (String s : sarr) {
            if (!s.equals("")) {
                String[] arr = Arrays.copyOf(answer, answer.length+1);
                arr[answer.length] = s;
                answer = arr;
            }
        }
        return answer;
    }
}