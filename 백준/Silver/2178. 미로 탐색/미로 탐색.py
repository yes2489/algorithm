from collections import deque
import sys
input = sys.stdin.readline

n,m = map(int, input().split())
board = []
for i in range(n):
    arr = list(map(int, input().strip()))
    board.append(arr)

dr = [1, 0, -1, 0]
dc = [0, -1, 0 , 1]
    
q = deque()
q.append((0,0))

while q:
    r, c = q.popleft()  
    
    if (r, c) == (n-1, m-1):
        break
    
    for i in range(4):
        nr = r + dr[i]
        nc = c + dc[i]
        if 0 <= nr < n and 0 <= nc < m and board[nr][nc] == 1:
            board[nr][nc] += board[r][c]
            q.append((nr, nc))

print(board[n-1][m-1])