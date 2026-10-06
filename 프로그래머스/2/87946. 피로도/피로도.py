from itertools import permutations

def solution(k, dungeons):
    answer = 0
    
    for p in permutations(dungeons):
        curr_k = k
        cnt = 0
        
        for min_k, use_k in p:
            if (curr_k >= min_k):
                curr_k -= use_k
                cnt += 1
        answer = max(answer, cnt)
        
    return answer