class Solution {
    public int solution(String my_string) {
        String[] sarr = my_string.split(" ");
        int answer = Integer.valueOf(sarr[0]) ;
        String op = "";
        for (int i = 1; i < sarr.length; i++) {
            if (sarr[i].equals("+") || sarr[i].equals("-")) {
                op = sarr[i];
            } else {
                answer = op.equals("+") ? answer+Integer.valueOf(sarr[i]) : answer-Integer.valueOf(sarr[i]);
            }
        }
        return answer;
    }
}