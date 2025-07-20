a, b = map(int, input().split())
ans = [a, b]
while len(ans) < 10:
    c = a + b
    if c >= 10:
        c = c % 10
    ans.append(c)
    a, b = b, c
for i in ans:
    print(i, end=" ")
