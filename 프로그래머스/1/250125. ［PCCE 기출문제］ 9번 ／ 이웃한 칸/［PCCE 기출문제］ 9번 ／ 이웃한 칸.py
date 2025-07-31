
def solution(board, h, w):
    n = len(board)
    cnt = 0
    
    DR = [-1, 0, 1, 0]
    DC = [0, 1, 0, -1]
    
    for i in range(4):
        r = h + DR[i]
        c = w + DC[i]
        if 0 <= r < n and 0 <= c < n:
            if board[r][c] == board[h][w]:
                cnt += 1
    return cnt