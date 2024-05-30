import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] oriArr = Arrays.copyOf(emergency, emergency.length);

        Arrays.sort(emergency);

        Map<Integer, Integer> map = new HashMap<>();
        int idx = emergency.length;
        for (int n : emergency) {
            map.put(n, idx--);
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = map.get(oriArr[i]);
        }

        return answer;
    }
}
