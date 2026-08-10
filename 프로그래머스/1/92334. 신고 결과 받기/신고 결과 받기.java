import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 1. 각 유저가 신고한 사람들
        Map<String, Set<String>> reportedBy = new HashMap<>();

        // 2. 각 유저가 신고당한 횟수
        Map<String, Integer> reportCount = new HashMap<>();

        // 초기화
        for (String id : id_list) {
            reportedBy.put(id, new HashSet<>());
            reportCount.put(id, 0);
        }

        // report 처리
        for (String r: report) {
            String[] tmp = r.split(" ");

            String reporter = tmp[0];
            String target = tmp[1];

            // 중복신고인지 확인하면서 reporter -> target 관계 저장
            if (reportedBy.get(reporter).add(target)) {
                // 처음 신고한 경우에만 target의 신고 횟수 + 1
                reportCount.put(target, reportCount.get(target) + 1);
            }
        }

        // 내가 신고한 사람들 순회하면서 그 사람이 k번 이상 신고 당했는지 확인
        int[] answer = new int[id_list.length];

        for (int i = 0; i < id_list.length; i++) {
            String id = id_list[i];

            for (String reported : reportedBy.get(id)) {
                if (reportCount.get(reported) >= k)
                    answer[i]++;
            }
        }

        return answer;
    }
}
