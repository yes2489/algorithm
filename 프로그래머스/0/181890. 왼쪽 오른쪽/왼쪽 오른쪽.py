def solution(str_list):
    length = len(str_list)
    answer = []
    for i in range(length):
        if str_list[i] == 'l':
            answer = str_list[0:i]
            break
        elif str_list[i] == 'r':
            answer = str_list[i+1:length+1]
            break
    return answer