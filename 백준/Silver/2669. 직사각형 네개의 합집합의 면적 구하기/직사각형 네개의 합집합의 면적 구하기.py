# 100*100 크기의 2차원 배열을 0으로 초기화
board = [[0 for _ in range(100)] for _ in range(100)]

# for문 돌면서 좌표 1로 바꾸기
for _ in range(4):
    x1, y1, x2, y2 = map(int, input().split())
    for i in range(x1, x2):
        for j in range(y1, y2):
            board[i][j] = 1
            
# 전체 board 순회하면서 1인 칸의 개수 세기
total = 0
for i in range(100):
    for j in range(100):
        if board[i][j] == 1:
            total += 1
print(total)
