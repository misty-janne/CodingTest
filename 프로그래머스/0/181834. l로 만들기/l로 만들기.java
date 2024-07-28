class Solution {
    public String solution(String myString) {
        char[] charr = myString.toCharArray();
        for (int i = 0; i < charr.length; i++) {
            if (charr[i] < 'l') charr[i] = 'l';                
        }
        return new String(charr);
    }
}