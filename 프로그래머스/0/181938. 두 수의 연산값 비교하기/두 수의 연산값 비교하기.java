class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(""+a+b);
        int _2ab = 2*a*b;
        return ab > _2ab ? ab : _2ab;
    }
}