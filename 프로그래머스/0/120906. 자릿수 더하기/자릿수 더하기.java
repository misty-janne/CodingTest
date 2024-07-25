class Solution {
    public int solution(int n) {
        int answer = 0;
        int ten = 10;
        while (n > 0) {
            int num = n;
            num /= ten;
            answer += n-(num*ten);                
            n /= ten;
        }
        return answer;
    }
}