import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] arr) {   
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        
        int findNum = 2;
        int fromIdx = list.indexOf(findNum);
        int toIdx = list.lastIndexOf(findNum);
        
        if (fromIdx == -1) return new int[] {-1};
        if (fromIdx == toIdx) return new int[] {findNum};        
        
        int[] answer = new int[toIdx - fromIdx +1];

        for (int i = 0; fromIdx <= toIdx; i++, fromIdx++) {
            answer[i] = arr[fromIdx];
        }
        
        return answer;
    }
}