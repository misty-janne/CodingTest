import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int[] narr = Arrays.copyOf(arr, arr.length);
        boolean loop = true;
        int answer = 1;
        while (loop) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    narr[i] = arr[i]/2;
                } else if (arr[i] < 50 && arr[i] % 2 > 0) {
                    narr[i] = (arr[i]*2)+1;                    
                }
            }
            if (Arrays.equals(arr, narr)) {
                answer--;
                break;
            } else {
                arr = Arrays.copyOf(narr, narr.length);
                answer++;
            }
        }
        return answer;
    }
}