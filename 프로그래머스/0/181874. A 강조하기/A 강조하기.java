class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] sarr = myString.split("");
        for (int i = 0; i < sarr.length; i++) {
            if (sarr[i].equalsIgnoreCase("a")) {
                answer += sarr[i].toUpperCase();
            } else {
                answer += sarr[i].toLowerCase();
            }
        }
        return answer;
    }
}