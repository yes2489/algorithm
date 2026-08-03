import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        // 완주한 선수 개수 저장
        for (String s : completion)
            map.put(s, map.getOrDefault(s, 0) + 1);

        // 참가자 확인
        for (String s : participant){
            int cnt = map.getOrDefault(s, 0);

            if (cnt == 0) {
                return s;
            }

            map.put(s, cnt - 1);
        }

        return "";
    }
}