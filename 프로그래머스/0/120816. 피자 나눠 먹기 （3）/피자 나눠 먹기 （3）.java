class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        int pizza = slice;
        
        while (slice / n < 1) {
            answer++;
            slice += pizza;
        }
        
        return answer;
    }
}