import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        List<Integer> countList = new ArrayList<>(map.values());
        
        countList.sort(Collections.reverseOrder());
    
        int answer = 0;
        int sum = 0;
        
        for (int i : countList){
            sum += i;
            answer++;
            if (sum >= k)
                break;
        }
        
        return answer;
    }
}