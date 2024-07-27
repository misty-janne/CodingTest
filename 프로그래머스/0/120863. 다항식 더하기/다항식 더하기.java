class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int num = 0;
        int xNum = 0;
        for (String p : polynomial.split(" \\+ ")) {
            if (p.contains("x")) {
                p = p.replaceAll("x", "");
                xNum += p.equals("") ? 1 : Integer.valueOf(p);
            } else {
                num += Integer.valueOf(p);
            }
        }
        if (xNum > 0) {
            answer = xNum == 1 ? "x" : xNum+"x";
            answer = num > 0 ? answer+" + "+num : answer;
        } else {
            answer += num;
        }
        return answer;
    }
}