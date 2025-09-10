import sys
sys.setrecursionlimit(1_000_000)
input = sys.stdin.readline



while True:
    w,h = map(int, input().split())
    # 1은 땅, 0은 바다
    if (w, h) == (0, 0):
        break
    board = [list(map(int, input().split())) for _ in range(h)]
    visited = [[False]*w for _ in range(h)]
    
    dr = [0, 1, 1, 1, 0, -1, -1, -1]
    dc = [1, 1, 0, -1, -1, -1, 0, 1]
    

    def dfs(r, c):
    
        for d in range(8):
            nr = r + dr[d]
            nc = c + dc[d]
        
            if 0 <= nr < h and 0 <= nc < w and not visited[nr][nc] and board[nr][nc] == 1:
                visited[nr][nc] = True
                dfs(nr, nc)
    
    cnt = 0    
    for i in range(h):
        for j in range(w):
            if board[i][j] == 1 and not visited[i][j]:
                cnt += 1
                dfs(i, j)
    
    print(cnt)
