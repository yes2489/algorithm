import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                char prev = stack.peek();
                if (prev == c)
                    stack.pop();
                else
                    stack.push(c);
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}