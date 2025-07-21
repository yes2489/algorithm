board = [list(map(int, input().split())) for row in range(4)]

total = 0
for i in range(4):
    for j in range(4):
        total += board[i][j]
    print(total)
    total = 0