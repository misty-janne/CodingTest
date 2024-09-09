class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = i+1, sum = 0; j <= n; j++) {
                sum += j;
                if (sum == n) answer++;
                if (sum > n) break;
            }
        }
        return answer;
    }
}