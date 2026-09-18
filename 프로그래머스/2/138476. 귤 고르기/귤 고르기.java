import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        // 크기별 귤 개수
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        // 귤 개수 기준으로 내림차순 정렬
        List<Integer> count = new ArrayList<>(map.values());
        count.sort(Collections.reverseOrder());
        
        int answer = 0; // 서로 다른 종류
        int sum = 0; // 담은 귤의 총 개수
        
        for(int cnt : count) {
            sum += cnt;
            answer++;
            
            if (sum >= k)
                break;
        }
        
        return answer;
    }
}