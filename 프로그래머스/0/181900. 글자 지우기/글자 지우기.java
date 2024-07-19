import java.util.Arrays;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] charry = my_string.toCharArray();
        for (int item : indices) {
            charry[item] = ' ';
        }
        answer = new String(charry);
        answer = answer.replaceAll(" ","");
        return answer;
    }
}