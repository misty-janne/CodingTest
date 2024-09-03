import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i],i);
        }
        for (String call : callings) {
            int idx = map.get(call);
            String temp = players[idx];
            players[idx] = players[idx-1];
            players[idx-1] = temp;
            map.put(players[idx],idx);
            map.put(players[idx-1],idx-1);
        }
        return players;
    }
}