class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        StringBuilder answer = new StringBuilder();
        for (int i = 0, j = 0; i < s.length(); i++, j++) {
            if (s.charAt(i) == ' ') j = -1;
            if (j == 0 && (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
                answer.append((char) (s.charAt(i) - 32));
            } else {
                answer.append(s.charAt(i));
            }
        }
        return answer.toString();
    }
}