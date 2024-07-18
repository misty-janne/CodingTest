import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String rsp) {
        String answer = "";
        Map<String,String> win = new HashMap<>();
        win.put("2","0");
        win.put("0","5");
        win.put("5","2");

        for(String s : rsp.split("")) {
            answer += win.get(s);
        }
        return answer;
    }
}