class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder(s.length());

        for (char c : s.toCharArray()) {
            if (c == ' '){
                answer.append(c);
            }else if (Character.isLowerCase(c)) {
                answer.append((char) ((c - 'a' + n) % 26 + 'a'));
            } else {
                answer.append((char) ((c - 'A' + n) % 26 + 'A'));
            }
        }

        return answer.toString();
    }
}