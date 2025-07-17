from collections import deque
import sys

input = sys.stdin.readline

num = int(input())
cardList = []
q = deque(cardList)
for i in range(1, num+1):
    q.append(i)

while(len(q) > 1):
    popItem = q.popleft()
    toEnd = q.popleft()
    q.append(toEnd)

print(*q)