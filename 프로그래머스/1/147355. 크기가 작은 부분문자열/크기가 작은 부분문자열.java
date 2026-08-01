class Solution {
    public int solution(String t, String p) {
        long target = Long.parseLong(p);
        int answer = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            long num = Long.parseLong(t.substring(i, i + p.length()));

            if (num <= target)
                answer++;
        }

        return answer;
    }
}