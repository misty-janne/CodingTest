import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
        	int cnt = 1;
        	for (int j = 0; j <= i; j++) {
				if (array[i] == array[j]) {
					cnt++;
				}
				map.put(array[i], cnt);
			}
		}
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        if (map.size() > 1) {
            keySet.sort((v1, v2) -> map.get(v2).compareTo(map.get(v1)));
            if (map.get(keySet.get(0)) == map.get(keySet.get(1))) {
				answer = -1;
			} else {
				answer = keySet.get(0);
			}
		} else {
			answer = keySet.get(0);
		}
        
        return answer;
    }
}