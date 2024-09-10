class Solution {
    public int solution(String s) {
        int answer = 0;
        int same = 0, diff = 0;
        char word = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (same == 0) word = c;
            if (c == word) {
                same++;
            } else {
                diff++;
            }
            if (same == diff) {
                answer++;
                same = 0; diff = 0;
            }
        }
        return same != diff ? answer+1 : answer;
    }
}