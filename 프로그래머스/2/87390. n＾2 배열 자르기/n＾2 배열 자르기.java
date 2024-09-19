class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int) (right-left)+1;
        int[] answer = new int[len];
        for (int idx = 0; idx < len; idx++) {
            long pos = left + idx;
            int row = (int) (pos / n);
            int col = (int) (pos % n);
            answer[idx] = Math.max(row, col) + 1;
        }
        return answer;
    }
}