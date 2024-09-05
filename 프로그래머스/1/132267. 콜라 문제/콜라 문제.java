class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int bin = 0;
        while (n+bin >= a) {
            n += bin;
            bin = n % a;
            n = n/a * b;
            answer += n;
        }
        return answer;
    }
}