class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int[] check = new int[schedules.length];
        
        for (int i = 0; i < timelogs.length; i++) {
            int date = startday;
            
            int maxHour = schedules[i] / 100;
            int maxMinute = schedules[i] % 100 + 10;
            
            if (maxMinute >= 60) {
                maxMinute -= 60;
                maxHour++;
            }
            
            for (int j = 0; j < 7; j++) {
                if (date == 6 || date == 7) {
                    date++;
                    if (date > 7)
                        date = date % 7;
                    continue;
                }
                
                int hour = timelogs[i][j] / 100;
                int minute = timelogs[i][j] % 100;
                
                if ((hour == maxHour && minute <= maxMinute) || (hour < maxHour)) {
                    check[i]++;
                }
                
                date++;
            }
        }
        
        for (int i : check) {
            if (i == 5)
                answer++;
        }
        
        return answer;
    }
}