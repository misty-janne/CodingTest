class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        while (myString.indexOf(pat) > -1) {
            myString = myString.substring(myString.indexOf(pat)+1);
            answer++;
        }
        return answer;
    }
}