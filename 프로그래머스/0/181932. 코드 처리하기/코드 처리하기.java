class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = true;
        int idx = 0;
        
        for (char c : code.toCharArray()) {
            if (c == '1') {
                mode = !mode;
            } else {
                if (mode) {
                    if (idx == 0 || idx % 2 == 0) {
                        answer+=c;
                    } 
                } else {
                    if (idx % 2 != 0) {
                        answer+=c;                    
                    } 
                }
            }
            idx++;
        }
        
        return answer.length() > 0 ? answer : "EMPTY";
    }
}