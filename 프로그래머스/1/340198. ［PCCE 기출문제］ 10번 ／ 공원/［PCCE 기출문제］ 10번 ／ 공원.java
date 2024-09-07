import java.util.*;
class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        for (int idx = mats.length-1; idx >= 0; idx--) {
            int m = mats[idx];
            for (int i = 0; i <= park.length-m; i++) {
                for (int j = 0; j <= park[i].length-m; j++) {
                    if (isAvailable(i, j, m, park)) return m;
                }
            }
        }
        return -1;
    }
    private boolean isAvailable(int x, int y, int m, String[][] park) {
        for (int i = x; i < x+m; i++) {
            for (int j = y; j < y+m; j++) {
                if (!park[i][j].equals("-1")) return false;
            }
        }
        return true;
    }

}