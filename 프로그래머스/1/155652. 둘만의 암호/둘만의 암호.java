class Solution {
    public String solution(String s, String skip, int index) {
        
        StringBuilder answer = new StringBuilder(s.length());
        
        for (char c : s.toCharArray()) {
            char letter = c;
            int idx = 0;
            
            while (idx < index) {
                letter = letter == 'z' ? 'a' : (char) (letter + 1);
                if (!skip.contains(String.valueOf(letter)))
                    idx++;
            }
            
            answer.append(letter);
        }
        return answer.toString();
    }
}