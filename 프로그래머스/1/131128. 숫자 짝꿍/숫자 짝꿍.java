import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        int[] cntX = new int[10];
        int[] cntY = new int[10];
        for (char c : X.toCharArray()) cntX[c - '0']++;
        for (char c : Y.toCharArray()) cntY[c - '0']++;

        StringBuilder sb = new StringBuilder();
        
        for (int i = 9; i >= 0; i--) {
            int comm = Math.min(cntX[i], cntY[i]);
            if (comm > 0) {
                char[] charr = new char[comm];
                Arrays.fill(charr, (char) ('0'+i));
                sb.append(charr);
            }
        }

        if (sb.length() == 0) return "-1";
        if (sb.charAt(0) == '0') return "0";
        
        return sb.toString();
    }
}