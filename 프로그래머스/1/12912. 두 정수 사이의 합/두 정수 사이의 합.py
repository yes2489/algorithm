def solution(a, b):
    start = 0
    end = 0
    if (a > b):
        start = b
        end = a
    else:
        start = a
        end = b
    answer = 0
    for i in range(start, end+1):
        answer += i
    return answer