import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 101;
        int cnt = 0;
        for (int a : array) {
            if (Math.abs(a-n) == Math.abs(answer-n)) {
                answer = a > answer ? answer : a;
            } else {
                answer = Math.abs(a-n) < Math.abs(answer-n) ? a : answer;
            }
        }
        return answer;
    }
}