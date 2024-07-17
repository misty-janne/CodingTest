class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int a = 1; a <= n; a++) {
            int b = n/a;
            if (a*b == n) answer++;
        }
        return answer;
    }
}