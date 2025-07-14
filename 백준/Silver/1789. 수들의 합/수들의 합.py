s=int(input())
total=0
cnt=0
while True:
    cnt += 1
    total += cnt
    # 누적합이 s를 초과하면 반복 종료
    if total > s:
        break
print(cnt-1)