def solution(intStrs, k, s, l):
    l += s
    ret = []
    for i in intStrs:
        ret.append(int(i[s:l]))
    answer = []
    
    for i in ret:
        if i > k:
            answer.append(i)

    return answer