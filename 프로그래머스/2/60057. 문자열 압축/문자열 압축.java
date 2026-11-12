import java.util.ArrayList;
import java.util.List;

class Solution {
    
    // 압축된 문자열의 가장 짧은 길이 반환
    private int compress(String str, int len) {
        StringBuilder sb = new StringBuilder();
        String last = "";
        int cnt =0;
        
        for (String token : split(str, len)) {
            if (last.equals(token)) {
                cnt++;
            } else{
                if (cnt > 0){
                    if (cnt > 1) sb.append(cnt);
                    sb.append(last);
                }
                
                last = token;
                cnt = 1;
            }
        }
        
        if (cnt > 0) {
            if (cnt > 1) sb.append(cnt);
            sb.append(last);
        }
        
        return sb.length();
    }
    
    // str을 len 만큼씩 잘라 tokens list에 추가
    private List<String> split(String str, int len) {
        List<String> tokens = new ArrayList<>();
        
        for (int startIdx = 0; startIdx < str.length(); startIdx += len) {
            int endIdx = startIdx + len;
            
            if (endIdx > str.length()) endIdx = str.length();
            
            tokens.add(str.substring(startIdx, endIdx));
        }
        
        return tokens;
    }
    
    public int solution(String s) {
        int min = Integer.MAX_VALUE;
        // 1부터 문자열 s의 길이만큼 자를 문자열의 길이를 설정하며 반복
        for (int length = 1; length <= s.length(); length++) {
            min = Math.min(min, compress(s, length)); 
        }        
        
        return min;
    }
}