class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i > 2) {
                for (int j = 2; j*j <= i; j++) {
                    if (i % j == 0) {
                        answer++;
                        j = i;
                    }
                }
            }
        }
        
        
        return answer;
    }
}