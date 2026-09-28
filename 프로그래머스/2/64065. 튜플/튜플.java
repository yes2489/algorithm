import java.util.*;

class Solution {
    public int[] solution(String s) {
        // 문자열에서 존재하는 "},{"를 "-"로 치환
        s = s.substring(2, s.length()- 2).replace("},{", "-");
        
        String[] arr = s.split("-");

        Arrays.sort(arr, Comparator.comparingInt(String::length));

        List<Integer> list = new ArrayList<>();

        // 각 집합을 순회하며 정수로 변환하여 리스트에 추가
        for (String str : arr) {
            String[] numArr = str.split(",");

            for (int i = 0; i < numArr.length; i++) {
                int num = Integer.parseInt(numArr[i]);

                // 중복된 값이 없을 때만 추가
                if (!list.contains(num)) {
                    list.add(num);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}