class Solution {
    public int solution(int number, int n, int m) {
        if (n < 2) return 0;
        if (m >= 10) return 0;
        if (number < 0 || number > 100) return 0;
        
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}