class Solution {
    public String solution(String s) {
        int idx = 0;
        StringBuilder answer = new StringBuilder(s.length());
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(c);
                idx = 0;
                continue;
            }
            
            answer.append(idx % 2 == 0 ?
                          Character.toUpperCase(c) :
                          Character.toLowerCase(c));
            
            idx++;
        }
        
        return answer.toString();
    }
}