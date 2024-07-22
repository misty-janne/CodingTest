class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int num = 0;
        for (char c : my_string.toCharArray()) {
            try {
                num = Integer.parseInt(c+"");
            } catch (Exception e) {                
                continue;
            }
            answer+=num;            
        }
        return answer;
    }
}