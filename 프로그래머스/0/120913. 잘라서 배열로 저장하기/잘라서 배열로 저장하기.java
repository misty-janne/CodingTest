class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length()%n > 0 ? my_str.length()/n+1 : my_str.length()/n];
        
        for (int i = 0, j = 0; i < answer.length; i++, j+=n) {
            if (i == answer.length-1) {
                answer[i] = my_str.substring(j);
            } else {
                answer[i] = my_str.substring(j, j+n);                
            }
        }
                
        return answer;
    }
}