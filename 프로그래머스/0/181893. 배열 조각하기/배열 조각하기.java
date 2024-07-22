import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length;
        int i = 0;
        for (int q : query) {
            if (i % 2 == 0) {
                end = start + q + 1;
            } else {
                start = start + q;
            }
            i++;
        }
        
        return Arrays.copyOfRange(arr, start, end);
    }
}