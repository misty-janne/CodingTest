class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] sp = s.split(" ");
        for (int i = 0; i < sp.length; i++) {
            if (!sp[i].equals("Z")) {
                answer += toInt(sp[i]);
            } else {
                answer -= toInt(sp[i-1]);
            }
        }
        return answer;
    }
    
    int toInt(String str) {
        int result = 0;
        try {
            result = Integer.parseInt(str);
        } catch(Exception e) {
            
        }
        return result;
    }
    
}