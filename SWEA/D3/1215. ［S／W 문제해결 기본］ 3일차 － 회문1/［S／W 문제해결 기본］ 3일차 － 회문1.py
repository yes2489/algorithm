for t in range(1, 11):
    # 회문 길이
    word = int(input())
    board = []
    
    # 보드 입력
    for i in range(8):
        board.append(list(input().strip()))
    
    cnt = 0
    # 가로 회문
    for i in range(8):
        for j in range(8 - word + 1):
            s = ''.join(board[i][j:j+word])
            if s == s[::-1]:
                cnt += 1

    # 세로 회문
    for i in range(8):
        for j in range(8 - word + 1):
            s = ''.join(board[j+k][i] for k in range(word))
            if s == s[::-1]:
                cnt += 1
            
    print(f'#{t} {cnt}')