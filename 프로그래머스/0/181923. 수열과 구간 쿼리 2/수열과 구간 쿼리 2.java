import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int[] tempArr = Arrays.copyOfRange(arr, s, e+1);
            Arrays.sort(tempArr);

            int item = -1;

            for (int t : tempArr) {
                if (t > k) {
                    item = t;
                    break;
                }
            }            
            answer[i] = item;
        }

        return answer;
    }
}