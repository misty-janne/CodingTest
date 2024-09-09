class Solution {
    public int[] solution(int n, int m) {
        return new int[]{gcd(n,m),(n*m)/gcd(n,m)};
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a; a = b;
            b = temp % b;
        }
        return a;
    }

}