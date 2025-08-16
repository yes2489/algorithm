from collections import Counter
import sys
input = sys.stdin.readline

n = int(input())
cards = list(map(int, input().split()))
m = int(input())
candidate = list(map(int, input().split()))

# Counter: 리스트 원소 개수를 세는 데 특화된 딕셔너리
cnt = Counter(cards)

# 구분자.join(리스트, 튜플 등의 문자열 시퀀스)
# : 문자열들을 이어 붙일 때 구분자를 끼워 넣어 하나의 문자열로 만듦
print(' '.join(str(cnt[i]) for i in candidate))