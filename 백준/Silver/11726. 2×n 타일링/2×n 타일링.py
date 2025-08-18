import sys
input = sys.stdin.readline

# An = A(n-1) + A(n-2)
# for 3부터 N까지 돌면서 이전값과 그 이전값을 더해서 10007로 나눠 저장
n = int(input())
dp = [0, 1, 2]

for i in range(3, n+1):
    dp.append((dp[i-1] + dp[i-2]) % 10007)

print(dp[n])