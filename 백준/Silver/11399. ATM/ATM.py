n = int(input())
p = list(map(int, input().split()))
p.sort()
total = 0
prev = 0
for i in range(n):
    total += (prev + p[i])
    prev += p[i]
print(total)