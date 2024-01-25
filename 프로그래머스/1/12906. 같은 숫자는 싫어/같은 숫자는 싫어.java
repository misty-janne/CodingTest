import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new));
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(list.get(0)));
        
        for (int i = 1; i < list.size(); i++) {
			if (list.get(i) != list.get(i-1)) {
				list2.add(list.get(i));
			}
		}
        answer = list2.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}