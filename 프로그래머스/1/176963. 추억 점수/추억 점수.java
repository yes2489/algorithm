import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 그리운 사람 별 점수
        Map<String, Integer> score = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            score.put(name[i], yearning[i]);
        }

        // 사진별 그리움 점수
        int[] answer = new int[photo.length];

        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                String person = photo[i][j];

                if (score.containsKey(person)) {
                    answer[i] += score.get(person);
                }
            }
        }

        return answer;
    }
}