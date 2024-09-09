class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[][] move = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int[] m : move) {
            int hm = h+m[0];
            int wm = w+m[1];
            if (hm < board.length && hm >= 0 && wm < board[0].length && wm >= 0 && board[h][w].equals(board[hm][wm])) {
                answer++;
            }
        }
        return answer;
    }
}