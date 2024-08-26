import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] arr = new int[n+1];
        Arrays.fill(arr,-1);
        for (int i : section) arr[i] = 1;
        for (int i = section[0]; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer++; i+=m-1;
            }
        }
        return answer;
    }
}