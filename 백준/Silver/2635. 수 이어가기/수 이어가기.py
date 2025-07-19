n = int(input())
# 최대 길이 변수 max_len 초기화
max_len = 0
# 가장 긴 수열을 저장할 리스트를 초기화
max_seq = []

# 1부터 n까지 반복하면서
for i in range(1, n+1):
    # 현재 수열을 [n, i]로 초기화
    seq = [n, i]
    a = n
     # 두 번째 수를 i로 설정
    b = i
    # 음수가 되기 전까지 반복
    while True :
        # 다음 수 계산 (이전 값 - 현재 값)
        c = a - b
        if c < 0:
            break
        # 다음 수를 수열에 추가
        seq.append(c)
        # 다음 수 갱신
        a, b = b, c
    # 현재 수열의 길이가 max_len 보다 길면 max_len 갱신, max_seq 갱신
    if len(seq) > max_len:
        max_len = len(seq)
        max_seq = seq[:]

print(max_len)
print(*max_seq)
