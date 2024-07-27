import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for (int a : answer) {
                if (arr[i] == a) cnt++;
            }
            if (cnt == 0) answer[idx++] = arr[i];
            if (idx == k) break;
        }
        return answer;
    }
}