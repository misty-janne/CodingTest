import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        for (int a : arr) {
            for (int i = 0; i < a; i++) {
                int[] narr = Arrays.copyOf(answer, answer.length+1);
                narr[answer.length] = a;
                answer = narr;
            }
        }
        return answer;
    }
}