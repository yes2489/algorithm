import sys
sys.setrecursionlimit(1_000_000)
input = sys.stdin.readline

n = int(input())
apt_map = [list(map(int, input().strip())) for _ in range(n)]
apt_list = []

dr = [-1, 0, 1, 0]
dc = [0, 1, 0, -1]

def dfs(r, c):
    
    # 현재 위치 방문 처리
    apt_map[r][c] = 0
    area = 1
    
    for i in range(4):
        nr = r + dr[i]
        nc = c + dc[i]
        # 범위 안에 있고, 아직 방문하지 않은(값이 1인) 칸이라면
        if 0 <= nr < n and 0 <= nc < n and apt_map[nr][nc] == 1:
            area += dfs(nr, nc)
    return area

# 전체 격자 순회
for i in range(n):
    for j in range(n):
        if apt_map[i][j] == 1:
            apt_list.append(dfs(i,j))
            
apt_list.sort()

# 단지 수 출력
print(len(apt_list))

# 오름차순으로 각 단지의 집 수 출력
for i in apt_list:
    print(i)