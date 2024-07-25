class Solution {
    public int solution(int n) {
        int i = (int) Math.sqrt(Double.valueOf(n));
        double d = Math.sqrt(Double.valueOf(n));
        
        return i == d ? 1 : 2;
    }
}