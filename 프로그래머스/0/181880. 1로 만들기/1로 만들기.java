import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int[] arr1 = new int[num_list.length];
        for (int i = 0; i < arr1.length; i++) arr1[i]++;
        
        while(!Arrays.equals(num_list, arr1)) {
            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] == 1) continue;
                
                if (num_list[i] % 2 == 0) {
                    num_list[i] /= 2;
                    answer++;
                } else {
                    num_list[i] = (num_list[i]-1)/2;
                    answer++;

                }
            }
        }
        return answer;
    }
}