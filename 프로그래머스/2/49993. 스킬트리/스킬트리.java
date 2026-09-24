import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        Map<Character, Integer> map = new HashMap<>();
        int idx = 0;
        
        for (char c : skill.toCharArray()) {
            map.put(c, idx++);
        }
        
        int answer = 0;
        
        for (String s : skill_trees) {
            boolean isComplete = true;
            idx = 0;
            
            for (char c : s.toCharArray()) {
                if (map.containsKey(c)) {
                    int seq = map.get(c);
                    if (idx != seq)
                        isComplete = false;
                    
                    idx++;
                }
            }
            
            if (isComplete) answer++;
        }
        
        return answer;
    }
}