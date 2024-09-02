import java.util.*;
import java.text.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = new int[privacies.length];
        int idx = 1, cnt = 0;
        Date todays = toDate(today);
        Calendar cal = Calendar.getInstance();
        for (String p : privacies) {
            Date days = toDate(p.split(" ")[0]);
            String code = p.split(" ")[1];
            cal.setTime(days);
            for (String t : terms) {
                if (code.equals(t.split(" ")[0])) {
                    cal.add(Calendar.MONTH, Integer.valueOf(t.split(" ")[1]));
                    if (todays.getTime() >= cal.getTimeInMillis()) {
                        answer[cnt++] = idx;
                    }
                }
            }
            idx++;
        }
        return Arrays.copyOf(answer,cnt);
    }
    
    public static Date toDate(String str) {
        Date days = new Date();
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy.MM.dd");
        try {
            days = fmt.parse(str);
        } catch(Exception e) {
        }
        return days;
    }
}