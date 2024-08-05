class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int cnt = 0;
            while (cnt < index) {
                c++;
                if (c > 'z') c = 'a';
                if (skip.indexOf(c) < 0) cnt++;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}