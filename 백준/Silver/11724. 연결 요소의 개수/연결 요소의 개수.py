import sys
sys.setrecursionlimit(1_000_000)
input = sys.stdin.readline

n, m = map(int, input().split())

# 인접행렬과 visited는 정점 수 n 기준으로 생성
arr = [[0] * (n + 1) for _ in range(n + 1)]
visited = [False] * (n + 1)

for i in range(m):
    x, y = map(int, input().split())
    arr[x][y] = arr[y][x] = 1

def dfs(now):
    visited[now] = True
    for next in range(1, n+1):
        if arr[now][next] == 1 and not visited[next]:
            dfs(next)

cnt = 0
for v in range(1, n + 1):
    if not visited[v]:
        cnt += 1
        dfs(v)

print(cnt)