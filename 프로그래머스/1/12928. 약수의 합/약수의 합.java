class Solution {
    public int solution(int n) {
        if (n == 0) return 0;
        int answer = 1;
        int num = 2;
        while (num <= n) {
            if (n % num == 0) {answer+=num;}
            num++;
        }
        return answer;
    }
}