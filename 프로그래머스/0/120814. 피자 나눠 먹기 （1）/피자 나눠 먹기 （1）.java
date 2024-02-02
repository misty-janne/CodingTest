class Solution {
    public int solution(int n) {
        int pizza = 7;
        int dish = pizza;
        int answer = 1;
        while (dish / n < 1) {
            answer++;
            dish = pizza * answer;
        }
        return answer;
    }
}