import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        for (int a : arr) {
            boolean exist = false;
            for (int d : delete_list) {
                if (a==d) { exist = true; break; }
            }
            if (!exist) {
                int[] narr = Arrays.copyOf(answer, answer.length+1);
                narr[answer.length] = a;
                answer = narr;
            }
        }
        return answer;
    }
}