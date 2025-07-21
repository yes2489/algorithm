n = int(input())
a = 0
for i in range(1, n+1):
    for j in range(1, i+1):
        a += 1
        print(a, end =' ')
    print()
        