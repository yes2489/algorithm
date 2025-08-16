import sys
input = sys.stdin.readline

n = int(input())
cards = list(map(int, input().split()))
m = int(input())
candidate = list(map(int, input().split()))

# 각 카드의 숫자 개수를 저장할 해시맵
cnt = {}
for card in cards:
    # 이미 본 숫자면 +=1, 처음 보는 숫자면 1로 초기화
    if card in cnt:
        cnt[card] += 1
    else:
        cnt[card] = 1

# 확인 할 숫자마다 보유 개수를 출력
for check in candidate:
    # cnt.get(key) -> key가 없으면 기본값 None을 반환
    res = cnt.get(check)
    if res == None:
        print(0, end=" ")
    else:
        print(res, end=" ")