import java.util.*;

class Solution {

    static class Word {
        String text;
        int start;
        int end;

        Word(String text, int start, int end) {
            this.text = text;
            this.start = start;
            this.end = end;
        }
    }

    public static int solution(String message, int[][] spoiler_ranges) {
        List<Word> words = new ArrayList<>();

        // 전체 메시지에서 단어, 각 단어의 시작 / 끝 인덱스 추출
        int len = message.length();
        int idx = 0;
        while (idx < len) {
            if (message.charAt(idx) == ' ') {
                idx++;
                continue;
            }

            int start = idx;
            while (idx < len && message.charAt(idx) != ' ') {
                idx++;
            }
            int end = idx - 1;

            words.add(new Word(message.substring(start, end + 1), start, end));
        }

        // 각 단어가 스포 방지 구간에 속하는지 여부
        boolean[] isSpoiler = new boolean[words.size()];
        List<String> secret = new ArrayList<>();

        for (int[] range : spoiler_ranges) {
            int rStart = range[0];
            int rEnd = range[1];

            for (int i = 0; i < words.size(); i++) {
                Word w = words.get(i);

                // 단어 구간과 스포 방지 구간이 겹치는지
                if (!(w.end < rStart || w.start > rEnd)) {
                    isSpoiler[i] = true;
                    secret.add(w.text);
                }
            }
        }

        // 스포 방지 구간 외 등장한 단어
        Set<String> normal = new HashSet<>();
        for (int i = 0; i < words.size(); i++) {
            if (!isSpoiler[i])
                normal.add(words.get(i).text);
        }

        // 왼쪽부터 순서대로 중요 단어 판별
        Set<String> answer = new HashSet<>();
        for (String word : secret) {
            if (!normal.contains(word)) {
                answer.add(word);
            }
        }
        return answer.size();
    }
}