import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[][] sts = {{1, 2, 3, 4, 5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] score = new int[3];
        int[] rank = new int[3];
        for (int i = 0; i < sts.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (answers[j] == sts[i][j % sts[i].length]) score[i]++;
            }
        }
        
        int maxScore = Math.max(score[0],Math.max(score[1],score[2]));
        
        int cnt = 0, idx = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] == maxScore) {
                rank[idx++] = i+1;
                cnt++;
            }
        }
        
        return Arrays.copyOf(rank, cnt);
    }
}