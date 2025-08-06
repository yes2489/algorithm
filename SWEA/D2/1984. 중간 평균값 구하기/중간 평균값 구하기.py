tc = int(input())

# 테스트케이스 반복
for t in range(tc):
    # 10개의 수
    nums = list(map(int, input().split()))
    nums.sort()
    res = 0
    for i in range(1, 9):
        res += nums[i]
    print(f'#{t+1} {res/8:0.0f}')