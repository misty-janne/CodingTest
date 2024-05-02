class Solution {
    public String solution(int age) {
        String answer = "";
        String[] ageArr = String.valueOf(age).split("");
        
        for (String item : ageArr) {
            int num = Integer.parseInt(item);
            num += 97;
            char c = (char) num;
            answer += String.valueOf(c);
        }
        return answer;
    }
}