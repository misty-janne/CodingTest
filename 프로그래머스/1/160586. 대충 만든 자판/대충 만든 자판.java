import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for (int i = 0; i < answer.length; i++) {
            int sum = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                if (mins(keymap,targets[i].charAt(j)) == -1) {
                    sum = -1; break;
                }
                sum += mins(keymap,targets[i].charAt(j));
            }
            answer[i] = sum;
        }
        return answer;
    }
    public int mins(String[] keymap, char c) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < keymap.length; i++) {
            if (keymap[i].indexOf(c) > -1) {
                list.add(keymap[i].indexOf(c)+1);
            }
        }
        return list.stream().min(Integer::compare).orElse(-1);
    }
}