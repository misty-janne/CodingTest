class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        if (str1.length() < str2.length()) return answer;
        
        for (int i = 0; i < str1.length(); i++) {
            String a = str1.substring(i,i+1);
            String b = str2.substring(i,i+1);
            answer += a + b;
        }
            
        return answer;
    }
}