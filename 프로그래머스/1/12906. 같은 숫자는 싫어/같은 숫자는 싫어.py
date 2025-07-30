def solution(arr):
    answer = []
    for i in arr:
        if len(answer) == 0:
            answer.append(i)
            continue
        else:
            item = answer.pop()
            if i == item:
                answer.append(item)
            else:
                answer.append(item)
                answer.append(i)
        
    return answer