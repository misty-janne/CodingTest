import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int lenArr = arr.length;
        int lenBin = Integer.toBinaryString(lenArr).length()-1;
        while (lenArr > Math.pow(2,lenBin)) ++lenBin;
        answer = Arrays.copyOf(arr, (int)Math.pow(2,lenBin));
        return answer;
    }
}