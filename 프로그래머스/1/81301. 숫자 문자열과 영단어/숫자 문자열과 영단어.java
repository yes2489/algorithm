import java.util.Arrays;

class Solution {
    public int solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int len = s.length();
        int idx = 0;

        for (int i = idx; i < len; i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                answer.append(c);
                continue;
            }

            StringBuilder convert = new StringBuilder(5);

            for (int j = i; j < i + 5; j++) {
                convert.append(s.charAt(j));
                idx = j;
                if (convert.length() >= 3) {
                    int numIdx = Arrays.asList(nums).indexOf(convert.toString());
                    if (numIdx > -1) {
                        answer.append(numIdx);
                        break;
                    }
                }
            }

            i = idx;
        }

        return Integer.parseInt(answer.toString());
    }
}