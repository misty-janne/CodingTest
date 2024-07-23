import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        for (String s : my_string.split("")) {
            try {
                int[] arr = Arrays.copyOf(answer, answer.length+1);
                arr[answer.length] = Integer.parseInt(s);
                answer = arr;
            } catch(Exception e) {
                continue;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}