class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // 알파벳 최소 누름 횟수 저장 배열
        int[] minPress = new int[26];
        
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                int idx = c - 'A';
                int cnt = i + 1;
                
                if (minPress[idx] == 0 || cnt < minPress[idx])
                    minPress[idx] = cnt;
            }
        }
        
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            int total = 0;
            boolean possible = true;
            
            for (char c : targets[i].toCharArray()) {
                int cnt = minPress[c - 'A'];
                
                if (cnt == 0) {
                    possible = false;
                    break;
                }
                
                total += cnt;
            }
            
            answer[i] = possible ? total : -1;
        }
        
        return answer;
    }
}