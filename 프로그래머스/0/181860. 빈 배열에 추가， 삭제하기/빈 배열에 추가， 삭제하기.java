import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int k = 0; k < arr[i]*2; k++) {
                    int[] narr = Arrays.copyOf(answer, answer.length+1);
                    narr[answer.length] = arr[i];
                    answer = narr;
                }                
            } else {
                answer = Arrays.copyOfRange(answer, 0, answer.length-arr[i]);
            }
        }
        return answer;
    }
}