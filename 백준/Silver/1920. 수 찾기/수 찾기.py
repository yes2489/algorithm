import sys
input = sys.stdin.readline
n = int(input())
# 검색 대상 -> list: 시간 초과, set으로 중복 제거
nSet = set(map(int, input().split()))
m = int(input())
mList = list(map(int, input().split()))

for mNum in mList:
    if mNum in nSet:
        print(1)
    else:
        print(0)