import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        // 옷 종류별로 누적
        for (String[] clothe : clothes) {
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        }

        int answer = 1;

        for (int cnt : map.values()) {
            answer *= cnt + 1;
        }

        return answer - 1;
    }
}