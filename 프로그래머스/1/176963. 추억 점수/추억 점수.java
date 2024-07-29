import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int len = photo.length;
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                int idx = Arrays.asList(name).indexOf(photo[i][j]);
                if (idx > -1) {
                    sum += yearning[idx];
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}