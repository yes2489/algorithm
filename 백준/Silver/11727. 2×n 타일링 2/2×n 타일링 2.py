import sys
input = sys.stdin.readline

# dp[i] = dp[i-1] + dp[i-2]*2
n = int(input())

# dp[] table 정의
# dp[i]: 2*i 길이의 직사각형을 만드는 방법의 수
dp = [0] * (n + 1)

# dp[]의 초기값 설정
# n == 1인 경우 dp[2]를 설정하면 index 오류 발생
# dp[1], dp[2] = 1, 3
dp[0], dp[1] = 1, 1

# 범위 정해서 반복 처리
for i in range(2, n+1):
    dp[i] = dp[i-1] + dp[i-2]*2
    
print(dp[n]%10007)