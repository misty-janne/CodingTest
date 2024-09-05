import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int p = -1;
        for(int m : moves) {
            p = stack.empty() ? p : stack.peek();
            for (int i = 0; i < board.length; i++) {
                if (board[i][m-1] > 0) {
                    if (p == board[i][m-1]) {
                        stack.pop(); answer++;
                    } else {
                        stack.push(board[i][m-1]);
                    }
                    board[i][m-1] = 0;
                    break;
                }
            }
        }
        return answer*2;
    }
}