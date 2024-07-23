import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                String[] arr = Arrays.copyOf(answer, answer.length+1);
                arr[answer.length] = todo_list[i];
                answer = arr;
            }
        }
        return answer;
    }
}