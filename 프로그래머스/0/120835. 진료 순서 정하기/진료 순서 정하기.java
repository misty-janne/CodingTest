import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] oriArr = Arrays.copyOf(emergency, emergency.length);

        Arrays.sort(emergency);
        for (int i = 0; i < emergency.length / 2; i++) {
            int temp = emergency[i];
            emergency[i] = emergency[emergency.length - 1 - i];
            emergency[emergency.length - 1 - i] = temp;
        }

        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int n : emergency) {
            map.put(n, ++idx);
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = map.get(oriArr[i]);
        }

        return answer;
    }
}