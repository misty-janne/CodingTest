import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] sarr = myString.split("x");
        String[] result = {};
        Arrays.sort(sarr);
        for (String s : sarr) {
            if (!s.equals("")) {
                String[] arr = Arrays.copyOf(result, result.length+1);
                arr[result.length] = s;
                result = arr;
            }
        }
        
        return result;
    }
}