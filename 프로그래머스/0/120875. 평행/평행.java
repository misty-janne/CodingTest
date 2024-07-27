class Solution {
    public int solution(int[][] dots) {
        if (parallel(dots[0], dots[1], dots[2], dots[3])) return 1;
        if (parallel(dots[0], dots[2], dots[1], dots[3])) return 1;
        if (parallel(dots[0], dots[3], dots[1], dots[2])) return 1;
        return 0;
    }
    boolean parallel(int[] xy1, int[] xy2, int[] xy3, int[] xy4) {
        return ((double)xy1[0]-xy2[0])/(xy1[1]-xy2[1]) == ((double)xy3[0]-xy4[0])/(xy3[1]-xy4[1]);
    }
    
}