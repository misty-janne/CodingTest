import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length < 2) return new int[]{-1};
        int[] answer = new int[arr.length-1];
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        int idx = 0;
        for (int a : arr) {
            if (a != arr2[0]) answer[idx++] = a;
        }
        return answer;
    }
}