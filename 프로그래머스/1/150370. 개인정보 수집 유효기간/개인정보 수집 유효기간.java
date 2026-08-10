import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>(terms.length);

        for (String s : terms) {
            String[] term = s.split(" ");
            map.put(term[0], Integer.parseInt(term[1]) * 28);
        }

        int todayDays = convertToDays(today);


        for (int i = 0; i < privacies.length; i++) {
            // i 번째 수집된 개인정보
            String[] privacy = privacies[i].split(" ");
            int prevDays = convertToDays(privacy[0]);
            int expireMonthDays = map.get(privacy[1]);

            if (todayDays >= prevDays + expireMonthDays) {
                list.add(i + 1);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    static int convertToDays(String s) {
        String[] date = s.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        return (year * 12 * 28) + (month * 28) + day;
    }
}