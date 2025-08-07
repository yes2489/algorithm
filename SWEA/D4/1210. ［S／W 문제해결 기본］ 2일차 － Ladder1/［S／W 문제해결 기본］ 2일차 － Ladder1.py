for t in range(1, 11):
    input()
    ladder=[list(map(int, input().split())) for _ in range(100)]
    
    # 도착 지점에서 거꾸로 찾아가기
    r = 99
    c = 0
    
    for i in range(100):
        if ladder[99][i] == 2:
            c = i

    while r != 0:
        r -= 1
        
        if c > 0 and ladder[r][c-1] == 1:
            while c > 0 and ladder[r][c-1] == 1:
                c -= 1
        elif c < 99 and ladder[r][c+1] == 1:
            while c < 99 and ladder[r][c+1] == 1:
                c += 1
    
    print(f'#{t} {c}')
        