nums = [int(input()) for _ in range(10)]
cnt3 = 0
cnt5 = 0
for num in nums:
    if num % 3 == 0 and num % 5 == 0:
        cnt3 += 1
        cnt5 += 1
    elif num % 3 == 0:
        cnt3 += 1
    elif num % 5 == 0:
        cnt5 += 1
print(cnt3, cnt5)