import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        for (int i = 0; i < arr.length; i++) {
            if (answer.length == 0) {
                answer = new int[] {arr[i]};
            } else {
                if (answer[answer.length-1] == arr[i]) {
                    answer = Arrays.copyOfRange(answer, 0, answer.length-1);
                } else {
                    int[] narr = Arrays.copyOf(answer, answer.length+1);
                    narr[answer.length] = arr[i];
                    answer = narr;
                }
            }
        }
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}