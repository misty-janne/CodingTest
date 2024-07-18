class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String left = s > 0 ? my_string.substring(0,s) : "";
        String right = e < my_string.length()-1 ? my_string.substring(e+1,my_string.length()) : "";
        String revers = "";
        for (int i = e; i > s-1; i--){
            revers += my_string.charAt(i);
        }
        
        return left+revers+right;
    }
}