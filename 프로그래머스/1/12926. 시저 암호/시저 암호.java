class Solution {
    public String solution(String s, int n) {
        int endToStart = 'z'-'a'+1;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                if (c >= 'a' && c <= 'z') {
                    c += n;
                    if (c > 'z') c -= endToStart;
                } else {
                    c += n;
                    if (c > 'Z') c -= endToStart;                    
                }
            }
            sb.append((c));
        }
        return sb.toString();
    }
}