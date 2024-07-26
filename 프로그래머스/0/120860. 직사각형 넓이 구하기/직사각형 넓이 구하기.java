import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int w = 0, h = 0;
        int[] xrr = new int[2], yrr = new int[2];
        Arrays.fill(xrr, dots[0][0]);
        Arrays.fill(yrr, dots[0][1]);
        for (int i = 0; i < dots.length; i++) {
            if (dots[i][0] != xrr[0]) xrr[1] = dots[i][0];
            if (dots[i][1] != yrr[0]) yrr[1] = dots[i][1];
        }

        h = Math.abs(xrr[0]-xrr[1]);
        w = Math.abs(yrr[0]-yrr[1]);
        return h*w;
    }
}