
import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[][] repo_list = new int[id_list.length][id_list.length];
        int[] block = new int[id_list.length];
        Set<String> set = new HashSet<>();
        for (String r : report) set.add(r);
        for (String s : set) {
            int i = Arrays.asList(id_list).indexOf(s.split(" ")[0]);
            int j = Arrays.asList(id_list).indexOf(s.split(" ")[1]);
            repo_list[i][j]++;
            block[j]++;
        }
        for (int i = 0; i < id_list.length; i++) {
            for (int j = 0; j < id_list.length; j++) {
                if (repo_list[i][j] > 0 && block[j] >= k) answer[i]++;
            }
        }
        return answer;
    }
}