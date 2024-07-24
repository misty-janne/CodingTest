import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] sarr = my_string.toLowerCase().split("");
        Arrays.sort(sarr);
        return String.join("",sarr);
    }
}