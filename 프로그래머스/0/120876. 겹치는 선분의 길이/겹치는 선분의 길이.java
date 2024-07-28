import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        List<int[]> overlaps = new ArrayList<>();
        
        overlaps.add(overlap(lines[0], lines[1]));
        overlaps.add(overlap(lines[0], lines[2]));
        overlaps.add(overlap(lines[1], lines[2]));

        overlaps.sort((a, b) -> Integer.compare(a[0], b[0]));

        int totalLength = 0;
        int start = overlaps.get(0)[0];
        int end = overlaps.get(0)[1];

        for (int[] interval : overlaps) {
            if (interval[0] <= end) {
                end = Math.max(end, interval[1]);
            } else {
                totalLength += end - start;
                start = interval[0];
                end = interval[1];
            }
        }
        totalLength += end - start;

        return totalLength;
    }

    int[] overlap(int[] se1, int[] se2) {
        int start = Math.max(se1[0], se2[0]);
        int end = Math.min(se1[1], se2[1]);
        if (start > end) {
            return new int[] {0, 0};
        }
        return new int[] {start, end};
    }
}