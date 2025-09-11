def solution(my_strings, parts):
    answer = ''
    length = len(my_strings)
    for i in range(length):
        answer += my_strings[i][parts[i][0]:parts[i][1]+1]
    return answer