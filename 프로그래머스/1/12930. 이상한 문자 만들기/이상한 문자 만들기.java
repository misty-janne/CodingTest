class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean upp = true;
        for (int i = 0; i < s.length(); i++) {
            String sub = s.substring(i,i+1);
            if (sub.equals(" ")) {
                upp = true;
                sb.append(sub);
            } else {
                sb.append(upp ? sub.toUpperCase() : sub.toLowerCase());
                upp = !upp;
            }
        }
        return sb.toString();
    }
}