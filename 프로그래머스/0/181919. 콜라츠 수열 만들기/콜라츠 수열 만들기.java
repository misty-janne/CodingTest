import java.util.Arrays;
class Solution {
    public int[] solution(int n) {
        int[] answer = {n};
        
        while(n>1) {
            n = n % 2 == 0 ? n/2 : 3*n+1;
            int[] arr = Arrays.copyOf(answer, answer.length + 1);
            arr[answer.length] = n;
            answer = arr; 
        }
        
        return answer;
    }
}