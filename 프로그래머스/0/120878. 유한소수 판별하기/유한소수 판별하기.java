class Solution {
    public int solution(int a, int b) {
        int gcd = gcd(a,b);
        a/=gcd;
        b/=gcd;
        
        if (b == 1) return 1;
        
        while (b % 2 == 0) b/=2;
        while (b % 5 == 0) b/=5;
        
        return b == 1 ? 1 : 2;
    }
    int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}