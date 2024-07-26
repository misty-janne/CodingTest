class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int maxLen = 1;
        for (String str : strArr) {
            maxLen = str.length() > maxLen ? str.length() : maxLen;
        }
        int k = 1;
        while (k <= maxLen) {
            int cnt = 0;
            for (String str : strArr) {
                if (str.length() == k) cnt++;
            }
            answer = cnt > answer ? cnt : answer;
            k++;
        }
        return answer;
    }
}