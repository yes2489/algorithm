import sys
input = sys.stdin.readline

k = int(input())
s = []

for _ in range(k):
    i = int(input())
    if i != 0:
        s.append(i)
    else:
        s.pop()
print(sum(s))