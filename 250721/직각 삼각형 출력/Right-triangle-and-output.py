n = int(input())
cnt = 0
i = 1
while True:
    if i % 2 != 0:
        cnt += 1
        print('*' * i)
    i += 1
    if (cnt == n):
        break