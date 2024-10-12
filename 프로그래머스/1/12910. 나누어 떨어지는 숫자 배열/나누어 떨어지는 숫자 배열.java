import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        Arrays.sort(arr);
        int idx = 0;
        for (int a : arr) if (a % divisor == 0) answer[idx++] = a;
        return idx == 0 ? new int[]{-1} : Arrays.copyOf(answer,idx);
    }
}