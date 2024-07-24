class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^0-9]"," ");
        for (String s : my_string.split(" ")) {
            try {
                answer += Integer.valueOf(s);
            } catch(Exception e) {
                continue;
            }            
        }
        return answer;
    }
}