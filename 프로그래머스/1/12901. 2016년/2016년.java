import java.time.*;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] days = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        LocalDate day = LocalDate.of(2016,a,b);
        return days[day.getDayOfWeek().getValue()-1];
    }
}