import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        String[] answer = players.clone();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String name : callings) {
            int rank = map.get(name);
            String player = answer[rank-1];

            answer[rank] = player;
            answer[rank-1] = name;

            map.put(name, rank - 1);
            map.put(player, rank);
        }

        return answer;
    }
}