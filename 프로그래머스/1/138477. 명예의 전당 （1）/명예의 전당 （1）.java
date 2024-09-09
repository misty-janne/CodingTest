import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] arr = new int[score.length];
        int idx = 0;
        for (int i = 0; i < score.length; i++) {
            arr[0] = score[i];
            Arrays.sort(arr);
            if (i < k) {
                answer[idx++] = arr[arr.length-i-1];
            } else {
                answer[idx++] = arr[arr.length-k];
            }
        }
        return answer;
    }
}