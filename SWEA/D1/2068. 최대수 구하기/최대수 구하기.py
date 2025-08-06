tc = int(input())

# 테스트케이스 반복
for t in range(tc):
    # 10개의 수
    nums = list(map(int, input().split()))
    nums.sort()
    print(f'#{t+1} {nums[9]}')