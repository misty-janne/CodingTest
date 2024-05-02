import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        
        int i = 0;
        while (i < arr.length) {
            int slen = stk.length;
            
            if (slen > 0) {
                if (stk[slen-1] < arr[i]) {
                    int[] tempArr = Arrays.copyOf(stk, slen + 1);
                    tempArr[slen] = arr[i];
                    stk = tempArr;
                    i++;                    
                } else {
                    int[] tempArr = Arrays.copyOf(stk, slen-1);
                    stk = tempArr;                    
                }
            } else {
                int[] tempArr = Arrays.copyOf(stk, slen + 1);
                tempArr[slen] = arr[i];
                stk = tempArr;
                i++;                
            }
        }
        
        return stk;
    }
}