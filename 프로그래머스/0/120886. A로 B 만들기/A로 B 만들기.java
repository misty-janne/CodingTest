import java.util.*;
class Solution {
    public int solution(String before, String after) {
        String[] sb = before.split("");
        String[] sa = after.split("");
        Arrays.sort(sb);
        Arrays.sort(sa);
        return Arrays.equals(sb,sa) ? 1 : 0;
    }
}