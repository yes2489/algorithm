import sys
input = sys.stdin.readline

# dp[i] += dp[i-1]
n = int(input())

# dp 1차원으로 설계, 초기화
dp = [1] * 10

for _ in range(n-1): # n-1번 처리
    for i in range(1, 10):
        dp[i] += dp[i-1]

ans = sum(dp)

print(ans%10007)