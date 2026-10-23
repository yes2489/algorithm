class Solution {
    public int solution(String s) {
        int len = s.length();
        int answer = len;
        
        // 1개 단위부터 s의 길이. /2 까지 자를 수 있음
        for (int i = 1; i <= len / 2; i++) {
            StringBuilder sb = new StringBuilder();
            String base = s.substring(0, i);
            int cnt = 1;
            
            // i 크기만큼씩 증가하며 비교
            for (int j = i; j <= len; j += i) {
                int endIdx = Math.min(j + i, len);
                String compare = s.substring(j, endIdx);
                
                if (base.equals(compare)) {
                    cnt++;
                } else {
                    // 이전까지 반복된 횟수가 2 이상이면 숫자 붙이기
                    if (cnt > 1) {
                        sb.append(cnt);
                    }
                    sb.append(base);
                    base = compare; // 기준 문자열 갱신
                    cnt = 1;
                }
            }
            
            if (cnt > 1) {
                sb.append(cnt);
            }
            sb.append(base);
            
            answer = Math.min(answer, sb.length());
        }
        
        return answer;
    }
}