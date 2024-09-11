class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (; left <= right; left++) {
            answer = dtf(left) ? answer + left : answer - left;
        }
        return answer;
    }
    public boolean dtf(int num) {
        boolean answer = true;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) answer = !answer;
        }
        return answer;
    }
}