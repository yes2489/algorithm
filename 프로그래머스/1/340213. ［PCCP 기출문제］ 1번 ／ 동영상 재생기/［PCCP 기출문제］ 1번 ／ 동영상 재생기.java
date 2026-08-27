class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video = toSec(video_len);
        int now = toSec(pos);
        int opening_start = toSec(op_start);
        int opening_end = toSec(op_end);
        
        // 시작 위치가 오프닝 구간인가?
        if (now >= opening_start && now <= opening_end)
                now = opening_end;
        
        for (String command : commands) {
            
            if (command.equals("prev")) {
                now = Math.max(0, now - 10);
            } else {
                now = Math.min(video, now + 10);
            }
            
            // 이동한 위치가 오프닝 구간인가?
            if (now >= opening_start && now <= opening_end)
                now = opening_end;
        }
        
        int min = now / 60;
        int sec = now % 60;
        
        StringBuilder answer = new StringBuilder();
        
        answer.append(min < 10 ? "0" + min : min)
            .append(":")
            .append(sec < 10 ? "0" + sec : sec);
        
        
        return answer.toString();
    }
    
    public static int toSec(String s_time) {
        String[] s = s_time.split(":");
        return Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]);
    }
}