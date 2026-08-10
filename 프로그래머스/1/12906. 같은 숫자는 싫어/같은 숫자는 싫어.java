import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for (int now : arr) {
            if (!stack.isEmpty()) {
                if (stack.peek() != now)
                    stack.push(now);
            } else {
                stack.push(now);
            }
        }

        int size = stack.size();

        int[] answer = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}