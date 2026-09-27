import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder(4);

        Map<Character, Integer> map = new HashMap<>();
        char[] types = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        for (char c : types) {
            map.put(c, 0);
        }
        
        for (int i = 0; i < survey.length; i++) {
            int choice = choices[i];
            
            if (choice == 4) continue;
            
            char disagree = survey[i].charAt(0);
            char agree = survey[i].charAt(1);
            
            if (choice < 4) {
                map.put(disagree, map.get(disagree) + (4 - choice));
            } else {
                map.put(agree, map.get(agree) + (choice - 4));
            }
        }
        
        char[][] indicators = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        for (char[] pair : indicators) {
            int first = map.get(pair[0]);
            int second = map.get(pair[1]);
            
            if (first >= second) {
                answer.append(pair[0]);
            } else {
                answer.append(pair[1]);
            }
        }
        
        return answer.toString();
    }
}