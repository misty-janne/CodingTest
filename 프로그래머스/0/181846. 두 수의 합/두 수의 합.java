import java.math.*;

class Solution {
    public String solution(String a, String b) {
        StringBuilder answer = new StringBuilder();
        boolean toss = false;
        int lenA = a.length();
        int lenB = b.length();
        int len = Math.min(lenA, lenB);
        
        for (int i = 0; i < len; i++) {
            int ia = a.charAt(lenA - 1 - i) - '0';
            int ib = b.charAt(lenB - 1 - i) - '0';
            int sum = ia + ib + (toss ? 1 : 0);
            toss = sum >= 10;
            answer.append(sum % 10);
        }
        
        String longerStr = lenA > lenB ? a : b;
        int longerLen = Math.max(lenA, lenB) - len;
        
        for (int i = longerLen - 1; i >= 0; i--) {
            int digit = longerStr.charAt(i) - '0';
            int sum = digit + (toss ? 1 : 0);
            toss = sum >= 10;
            answer.append(sum % 10);
        }
        
        if (toss) answer.append(1);
        
        return answer.reverse().toString();
    }
}