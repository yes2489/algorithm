from collections import deque

def bfs(i, j):
    q = deque()
    q.append((i, j))
    dr = [-1, 1, 0, 0]
    dc = [0, 0, -1, 1]
    cnt = 1
    while q:
        r, c = q.popleft()
        for k in range(4):
            R = r + dr[k]
            C = c + dc[k]
            if (0 <= R < M) and (0 <= C < N) and graph[R][C] == 0:
                graph[R][C] = 1
                q.append((R, C))
                cnt += 1
    return cnt

M, N, K = map(int, input().split())
graph = [[0] * N for _ in range(M)]

for _ in range(K):
    x1, y1, x2, y2 = map(int, input().split())
    for i in range(y1, y2):
        for j in range(x1, x2):
            graph[i][j] = 1

res = []
for i in range(M):
    for j in range(N):
        if graph[i][j] == 0:
            graph[i][j] = 1
            res.append(bfs(i, j))

print(len(res))
print(*sorted(res))
