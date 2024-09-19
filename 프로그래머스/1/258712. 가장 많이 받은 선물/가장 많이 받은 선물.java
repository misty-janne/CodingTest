import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int len = friends.length;
        int[][] gat = new int[len][len];
        int[] jisu = new int[len];
        int[] rank = new int[len];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) map.put(friends[i], i);
        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            int give = map.get(parts[0]);
            int take = map.get(parts[1]);
            gat[give][take]++;
            jisu[give]++; jisu[take]--;
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i != j) {
                    if (gat[i][j] == gat[j][i]) {
                        if (jisu[i] > jisu[j]) rank[i]++;
                    } else {
                        if (gat[i][j] > gat[j][i]) rank[i]++;
                    }
                }
            }
        }
        return Arrays.stream(rank).max().getAsInt();
    }
}