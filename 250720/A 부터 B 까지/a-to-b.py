a, b = map(int, input().split())
while a <= b:
    print(a, end=" ")
    if a % 2 != 0:
        a *= 2
    else:
        a += 3