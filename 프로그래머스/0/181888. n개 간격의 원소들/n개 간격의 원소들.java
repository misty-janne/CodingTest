import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {        
        int len = num_list.length;
        int cnt = 0;
        for (int i = 0; i < len; i+=n) {
            cnt++;
        }
        int[] answer = new int [cnt];
        int idx = 0;
        for (int i = 0; i < len; i+=n) {
            answer[idx++] = num_list[i];
        }
        return answer;
    }
}