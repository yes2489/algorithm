n, m = map(int, input().split())

board1 = [list(map(int, input().split())) for row in range(m)]
board2 = [list(map(int, input().split())) for row in range(m)]

result = []
for i in range(n):
    result_row=[]
    for j in range(m):
        if board1[i][j] == board2[i][j]:
            result_row.append(0)
        else:
            result_row.append(1)
    result.append(result_row)

for row in result:
    print(*row)