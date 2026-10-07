# 파이썬 진법 변환 (10 -> ?)
# 2진법: bin()[2:] // 접두사 제거
# 8진법: oct()[2:]
# 16진법: hex()[2:]

def solution(n):
    cnt_n = bin(n).count('1')
    
    next_n = n + 1
    while True:
        if bin(next_n).count('1') == cnt_n:
            return next_n
        next_n += 1