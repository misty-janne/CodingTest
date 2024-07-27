import java.util.*;
class Solution {
    public int solution(int[][] board) {
        int len = board.length;
        int total = len * len;
        List<int[]> coords = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (board[i][j] == 1) {
                    coords.add(new int[]{i, j}); cnt++;
                }
            }
        }
        int cnt2 = 0;
        for (int[] xy : coords) {
            int x = xy[0], y = xy[1];
            for (int i = Math.max(0, x-1); i <= Math.min(len-1, x+1); i++) {
                for (int j = Math.max(0, y-1); j <= Math.min(len-1, y+1); j++) {
                    if (board[i][j] == 0) {
                        board[i][j] = -1; cnt2++;
                    }
                }
            }
        }
        return total-(cnt+cnt2);
    }
}