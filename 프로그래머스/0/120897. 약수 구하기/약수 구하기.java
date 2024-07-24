import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        for (int i = 1; i <= n; i++) {
           if (n % i == 0) {
               int[] arr = Arrays.copyOf(answer, answer.length+1);
               arr[answer.length] = i;
               answer = arr;
           } 
        }
        
        return answer;
    }
}