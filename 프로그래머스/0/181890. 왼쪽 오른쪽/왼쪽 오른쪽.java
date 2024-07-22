import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int start = -1;
        int end = str_list.length;
        String dir = "";
        int idx = 0;
        for (String str : str_list) {
            if (str.equals("l")) {
                if (idx > 0) {
                    dir = str;
                    start = 0;
                    end = idx;
                }
                break;                    
            } else if (str.equals("r")) {
                if (idx < str_list.length-1) {
                    dir = str;
                    start = idx+1;
                    end = str_list.length;
                }
                break;
            }
            idx++;
        }
        
        if (!dir.equals("")) {
            answer = Arrays.copyOfRange(str_list, start, end);
        }        
        
        return answer;
    }
}