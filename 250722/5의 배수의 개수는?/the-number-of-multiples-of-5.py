board = [list(map(int, input().split())) for row in range(4)]

res = 0
for i in range(4):
    for j in range(4):
        if board[i][j] % 5 == 0:
            res += 1
print(res)
