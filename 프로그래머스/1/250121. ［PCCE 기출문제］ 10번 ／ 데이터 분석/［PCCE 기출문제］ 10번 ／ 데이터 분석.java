import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = new int[data.length][data[0].length];
        String[] title = {"code","date","maximum","remain"};
        int idx = 0;
        for (int[] d : data) {
            if (val_ext > d[Arrays.asList(title).indexOf(ext)]) {
                answer[idx++] = d.clone();
            }
        }
        answer = Arrays.copyOf(answer, idx);
        for (int i = 0; i < answer.length-1; i++) {
            for (int j = i+1; j < answer.length; j++) {
                if (answer[i][Arrays.asList(title).indexOf(sort_by)] > answer[j][Arrays.asList(title).indexOf(sort_by)]) {
                    int[] temp = answer[i].clone();
                    answer[i] = answer[j].clone();
                    answer[j] = temp;
                }
            }
        }
        return answer;
    }
}