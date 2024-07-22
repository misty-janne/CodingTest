import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                int[] arr = Arrays.copyOf(answer, answer.length+1);
                arr[answer.length] = numlist[i];
                answer = arr;
            }
        }
        return answer;
    }
}