class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for (String[] s : db) {
            if (id_pw[0].equals(s[0])) {
                answer = id_pw[1].equals(s[1]) ? "login" : "wrong pw";
                break;
            }
        }
        return answer.equals("") ? "fail" : answer;
    }
}