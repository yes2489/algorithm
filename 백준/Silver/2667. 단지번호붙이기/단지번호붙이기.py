import sys
sys.setrecursionlimit(1_000_000)
input = sys.stdin.readline

n = int(input())
board = [list(map(int, input().strip())) for _ in range(n)]
apt_list = []

dr = [1, 0, -1, 0]
dc = [0, -1, 0, 1]

def dfs(r, c):

    # 방문 체크
    board[r][c] = 0
    area = 1
    
    for i in range(4):
        nr = r + dr[i]
        nc = c + dc[i]
        
        if 0 <= nr < n and 0 <= nc < n and board[nr][nc] == 1:
            area += dfs(nr, nc)
    return area
    
    

for i in range(n):
    for j in range(n):
        if board[i][j] == 1:
            apt_list.append(dfs(i, j))

apt_list.sort()

print(len(apt_list))
for i in apt_list:
    print(i)