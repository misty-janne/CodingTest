import java.util.*;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        int num_len = num_list.length;
        
        int num_new = num_list[num_len-1] > num_list[num_len-2] ?
                        num_list[num_len-1]-num_list[num_len-2] : num_list[num_len-1]*2;
        
        answer = Arrays.copyOf(num_list, num_len + 1);
        answer[num_len] = num_new;
        
        return answer;
    }
}