class Solution {
    public String solution(String s, String skip, int index) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
            
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int idx = alphabet.indexOf(String.valueOf(c));
            String letter = String.valueOf(alphabet.charAt(idx));

            for (int i = 0; i < index; i++) {
                idx = checkIdx(idx);
                
                letter = String.valueOf(alphabet.charAt(idx));
                
                if (skip.contains(letter)) {
                    while (skip.contains(letter)) {
                        idx = checkIdx(idx);
                        letter = String.valueOf(alphabet.charAt(idx));
                    }
                }
            }
            
            sb.append(letter);
        }
        
        return sb.toString();
    }
    
    public static int checkIdx(int idx) {
        idx++;
        
        if (idx >= 26) {
            return 0;
        } else {
            return idx;
        }
    }
}