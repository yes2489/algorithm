import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            String prev = words[i - 1];

            // 끝말잇기 실패
            if (word.charAt(0) != prev.charAt(prev.length() - 1) || set.contains(word)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            
            set.add(word);

        }
        
        return answer;
    }
}