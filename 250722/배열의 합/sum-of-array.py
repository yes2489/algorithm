board = [list(map(int, input().split())) for row in range(4)]

for i in range(4):
    print(sum(board[i]))