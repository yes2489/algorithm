class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(push(c, n));
        }
        
        return sb.toString();
    }
    
    private char push(char c, int n) {
        if (!Character.isAlphabetic(c)) return c;
        
        // c를 n만큼 밀어 반환
        int offset = Character.isUpperCase(c) ? 'A' : 'a';
        int position = c - offset;
        position = (position + n) % ('Z' - 'A' + 1);
        return (char) (offset + position);
    }
}