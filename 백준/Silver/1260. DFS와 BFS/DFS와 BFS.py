# 필요한 모듈 임포트 (queue 사용)
import sys
from collections import deque

input = sys.stdin.readline

# 정점의 개수 N, 간선의 개수 M, 탐색을 시작할 정점의 번호 V
n, m, v = map(int, input().split())

# 인접 행렬과 방문 배열 초기화 시 괄호 위치에 주의
board = [[0]*(n+1) for _ in range(n+1)]
visited = [False] * (n+1) # dfs용 방문 배열은 1차원이어도 충분

# 간선(양방향) 입력 받기
for _ in range(m):
    x, y = map(int, input().split())
    board[x][y] = board[y][x] = 1

def dfs(now):
    visited[now] = True  # 현재 노드 방문 처리 필요
    print(now, end=" ")  # 정점 번호를 출력해야 함

    for next in range(1, n+1): # 인덱스 범위가 0부터가 아니라 1부터
        if board[now][next] == 1 and not visited[next]: # 방문 배열 접근 시 next 확인
            dfs(next)

dfs(v)
print()

# bfs 시작
q = deque()
q.append(v)

# visited 배열 초기화
visited = [False] * (n+1)
visited[v] = True

while q:
    now = q.popleft()
    print(now, end=" ")

    # 모든 노드에 대해 현재 노드와 연결된 노드 탐색
    for next in range(1, n+1):
        if board[now][next] == 1 and not visited[next]:
            visited[next] = True
            q.append(next)
