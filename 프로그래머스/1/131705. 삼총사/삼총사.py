import itertools

def solution(number):
    answer = itertools.combinations(number, 3)
    cnt = 0
    for i in answer:
        if sum(i) == 0:
            cnt += 1
    return cnt