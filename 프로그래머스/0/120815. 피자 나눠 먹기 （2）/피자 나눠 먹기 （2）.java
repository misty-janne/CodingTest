class Solution {
    public int solution(int n) {
        int answer = 1;
        int p = 6;
        
        while (p % n != 0) {
            answer++;
            p += 6;
        }
        
        return answer;
    }
}