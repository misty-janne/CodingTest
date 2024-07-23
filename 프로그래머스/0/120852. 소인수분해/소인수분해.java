import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                int[] arr = Arrays.copyOf(answer, answer.length+1);
                arr[answer.length] = i;
                answer = arr;                    
            }
        }
        return answer;
    }
    
    boolean isPrime (int num) {
        if (num < 2) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }        
}