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
        
        StringBuilder sb = new StringBuilder();
        
        for (String s : record) {
            String[] temp = s.split(" ");
            String status = temp[0];
            
            if (status.equals("Change")) continue;
            
            sb.append(user.get(temp[1]));
            
            if (status.equals("Enter")) {
                sb.append("님이 들어왔습니다./");
            } else if (status.equals("Leave")) {
                sb.append("님이 나갔습니다./");
            }
        }
        
        String[] answer = sb.toString().split("/");
        
        return answer;
    }
}