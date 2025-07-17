import sys

input = sys.stdin.readline

num = int(input())

member = []

for _ in range(num):
    age, name = input().split()
    member.append([int(age), name])

for i in sorted(member, key = lambda x: x[0]):
    print(i[0], i[1])