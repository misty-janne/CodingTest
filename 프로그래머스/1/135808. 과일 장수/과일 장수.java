import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        
        for (int i = 0; i < score.length / 2; i++) {
            int temp = score[i];
            score[i] = score[score.length - i - 1];
            score[score.length - i - 1] = temp;
        }
        
        int cnt = 1;
        
        for (int itemScore : score) {
            if (cnt == m) {
                answer += itemScore * m;
                cnt = 1;
            } else {
                cnt ++;
            }
        }        
        return answer;
    }
}