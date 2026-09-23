class Solution {
    public long solution(int n) {
        if (n <= 2)
            return n;
        
        long[] dp = new long[n + 1];
        dp[1] = 1; // 1칸에 도달하는 방법: (1)
        dp[2] = 2; // 2칸에 도달하는 방법: (1+1), (2)
        
        for (int i = 3; i <= n; i++) {
            // i번째 칸에 오는 방법 = (i - 1번째 칸에서 1칸 뛰기) + (i - 2번째 칸에서 2칸 뛰기)
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }
        return dp[n];
    }
}