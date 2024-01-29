class Solution {
    public int solution(int a, int b) {
        int sums1 = Integer.parseInt(a+""+b);
        int sums2 = Integer.parseInt(b+""+a);
        return sums1 > sums2 ? sums1 : sums2 ;
    }
}