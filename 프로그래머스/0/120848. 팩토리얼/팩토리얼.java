class Solution {
    public int solution(int n) {
        if (n <= 1) return 1;
            
        int answer = 0;
        int num = 1;
        while (num < n) {
            answer++;
            num *= answer;
        }
        
        return num == n ? answer : answer-1;
    }
}