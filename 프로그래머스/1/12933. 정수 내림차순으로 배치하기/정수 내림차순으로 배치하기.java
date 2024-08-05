class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] carr = String.valueOf(n).toCharArray();
        for (int i = 1; i < carr.length; i++) {
            for (int j = 0; j < carr.length-i; j++) {
                if (carr[j] < carr[j+1]) {
                    char temp = carr[j];
                    carr[j] = carr[j+1];
                    carr[j+1] = temp;
                }
            }
        }
        return Long.valueOf(new String(carr));
    }
}