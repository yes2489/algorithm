class Solution {
    public int solution(int n) {
        // 정수를 3진법으로 전환
        String str = Integer.toString(n, 3);
        
        // reverse
        String reversed = new StringBuilder(str).reverse().toString();
        
        // 3진법을 10진법으로 변환
        return Integer.valueOf(reversed, 3);
    }
}