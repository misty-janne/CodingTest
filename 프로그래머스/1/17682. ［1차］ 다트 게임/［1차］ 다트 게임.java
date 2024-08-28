import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int[] arr = new int[3];
        int idx = -1;
        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);
            if (Character.isDigit(ch)) {
                if (ch == '1' && dartResult.charAt(i+1) == '0') {
                    arr[++idx] = 10; i++;
                } else {
                    arr[++idx] = ch - '0';
                }
            } else if (toSDT(ch) > -1) {
                arr[idx] = (int)Math.pow(arr[idx],toSDT(ch));
            } else if (ch == '*') {
                arr[idx] *= 2;
                if (idx > 0) arr[idx-1] *= 2;
            } else if (ch == '#') {
                arr[idx] *= (-1);
            }
        }
        return Arrays.stream(arr).sum();
    }
    
    public int toSDT(char sdt) {
        return sdt == 'S' ? 1 : (sdt == 'D' ? 2 : (sdt == 'T' ? 3 : -1));
    }
}