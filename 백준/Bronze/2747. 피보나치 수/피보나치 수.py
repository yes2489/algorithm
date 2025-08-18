import sys
input = sys.stdin.readline

# Fn = F(n-1) + F(n-2)
n = int(input())

dp = [0] * (n + 1)
dp[0] = 0
dp[1] = 1

for i in range(2, n+1):
    dp[i] = dp[i-1] + dp[i-2]
    
print(dp[n])