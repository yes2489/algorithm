import java.util.*;

class Solution {
    // 누적 주차 시간 기록 <차량번호, 주차 시간(분)>
    public static Map<String, Integer> parkingTime = new TreeMap<>(); 
    
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> map = new HashMap<>(); // 입차 시간 기록 <차량번호, 입차시각(분)>
        
        for (String s : records) {
            String[] record = s.split(" ");
            int time = setTime(record[0]);
            String carNum = record[1];
            
            // 입차인 경우
            if (record[2].equals("IN")) {
                map.put(carNum, time);
            } else {
                int inputTime = map.get(carNum);
                time -= inputTime;
                map.remove(carNum);
                
                sumParkingTime(carNum, time);
            }
        }
        
        // 만약 map에 차가 남아있으면 23:59에 출차한 것으로 간주
        if (!map.isEmpty()) {
            for (String key : map.keySet()) {
                int inputTime = map.get(key);
                int time = (23 * 60) + 59 - inputTime;
                
                sumParkingTime(key, time);
            }
        }
        
        // 차량 번호가 작은 자동차부터 청구할 주차 요금 정수 배열에 담아 return
        int[] answer = new int[parkingTime.size()];
        int idx = 0;
        
        for (String key : parkingTime.keySet()) {
            int fee = fees[1]; // 기본 요금으로 시작
            double time = parkingTime.get(key);
            time -= fees[0];
            
            if (time <= 0) {
                answer[idx++] = fee;
                continue;
            }
            
            // 초과 시간 나누어 떨어지지 않을 경우 올림
            time = Math.ceil(time / fees[2]);
            fee += (int) time * fees[3];
            answer[idx++] = fee;
        }
        
        return answer;
    }
    
    public int setTime(String s) {
        String[] time = s.split(":");
        int h = Integer.parseInt(time[0]) * 60;
        int m = Integer.parseInt(time[1]);
        return h + m;
    }
    
    public void sumParkingTime(String key, int time) {
        if (parkingTime.containsKey(key)) {
            parkingTime.put(key, parkingTime.get(key) + time);
        } else {
            parkingTime.put(key, time);
        }
    }
}