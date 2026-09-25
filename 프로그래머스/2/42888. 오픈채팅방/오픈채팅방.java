import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] record) {

        Map<String, String> user = new HashMap<>();

        for (String s : record) {
            String[] temp = s.split(" ");
            String status = temp[0];

            if (status.equals("Enter") || status.equals("Change")) {
                user.put(temp[1], temp[2]);
            }
        }
        
        String[] ans = new String[record.length];
        int idx = 0;
        
        for (String s : record) {
            String[] temp = s.split(" ");
            String status = temp[0];
            String nickname = user.get(temp[1]);
            
            if (status.equals("Change")) 
                continue;

            if (status.equals("Enter")) {
                ans[idx++] = nickname + "님이 들어왔습니다.";
            } else if (status.equals("Leave")) {
                ans[idx++] = nickname + "님이 나갔습니다.";
            }
        }
        
        String[] answer = new String[idx];
        System.arraycopy(ans, 0, answer, 0, idx);
        
        return answer;
    }
}