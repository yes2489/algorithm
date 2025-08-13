import sys
from collections import deque
input = sys.stdin.readline

n, m = map(int, input().split())
board = [list(map(int, input().strip())) for _ in range(n)]

q = deque()
q.append((0, 0))

while q:
    r, c = q.popleft()
    
    dr = [-1, 0, 1, 0]
    dc = [0, 1, 0, -1]

    for i in range(4):
        nr = r + dr[i]
        nc = c + dc[i]

        if 0 <= nr < n and 0 <= nc < m and board[nr][nc] == 1:
            board[nr][nc] = board[r][c] + 1
            q.append((nr, nc))

print(board[n-1][m-1])