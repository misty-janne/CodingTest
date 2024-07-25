class Solution {
    public int[] solution(String myString) {
        String[] sarr = myString.split("x");
        int[] answer = new int[(myString.length() - myString.replaceAll("x","").length())+1];
        for (int i = 0; i < sarr.length; i++) {
            answer[i] = sarr[i].length();
        }
        return answer;
    }
}