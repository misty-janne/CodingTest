class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int k = 0;
        int i = 0, j = 0;
        while (num <= n*n) {
            for (; j < n-k; j++) {
                answer[i][j] = num++;
            }
            i++;j--;
            for (; i < n-k; i++) {
                answer[i][j] = num++;
            }
            i--;j--;
            for (; j >= k; j--) {
                answer[i][j] = num++;
            }
            i--;j++;
            for (; i > k; i--) {
                answer[i][j] = num++;
            }
            i++;j++;
            k++;
        }
        return answer;
    }
}