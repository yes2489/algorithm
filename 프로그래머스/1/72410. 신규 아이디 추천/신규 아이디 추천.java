class Solution {
    public String solution(String new_id) {
        StringBuilder answer = new StringBuilder();

        // 1, 2단계
        for (char c : new_id.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c) || Character.isDigit(c)
                    || c == '-' || c == '_' || c == '.') {
                answer.append(c);
            }
        }

        // 3단계
        while (answer.indexOf("..") != -1) {
            answer.deleteCharAt(answer.indexOf(".."));
        }

        // 4단계
        if (!answer.isEmpty() && answer.charAt(0) == '.') {
            answer.deleteCharAt(0);
        }

        if (!answer.isEmpty() && answer.charAt(answer.length() - 1) == '.') {
            answer.deleteCharAt(answer.length() - 1);
        }

        // 5단계
        if (answer.isEmpty()) {
            answer.append('a');
        }

        // 6단계
        if (answer.length() >= 16) {
            answer.setLength(15);

            if (answer.charAt(answer.length() - 1) == '.') {
                answer.deleteCharAt(answer.length() - 1);
            }
        }

        // 7단계
        while (answer.length() < 3) {
            answer.append(answer.charAt(answer.length() - 1));
        }

        return answer.toString();
    }
}
