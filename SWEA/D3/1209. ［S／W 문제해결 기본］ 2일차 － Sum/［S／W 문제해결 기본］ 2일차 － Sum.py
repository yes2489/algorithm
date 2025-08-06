for t in range(1, 11):
    input()
    board = [list(map(int, input().split())) for _ in range(100)]
    
    ans = 0
    diag1 = diag2 = 0
    
    for i in range(100):
        # 행의 합, 열의 합
        r_sum = c_sum = 0
        for j in range(100):
            r_sum += board[i][j]
            c_sum += board[j][i]
        ans = max(ans, r_sum, c_sum)
        
        # 대각선의 합
        diag1 += board[i][i]
        diag2 += board[i][99-i]
        
    ans = max(ans, diag1, diag2)    
    print(f'#{t} {ans}')