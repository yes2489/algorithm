from collections import Counter

def solution(topping):
    answer = 0
    
    r_counter = Counter(topping)
    
    # 왼쪽 조각들 확인 할 set
    left_set = set()
    
    for t in topping:
        left_set.add(t)
        
        r_counter[t] -= 1
        
        if r_counter[t] == 0:
            del r_counter[t]
        
        if len(left_set) == len(r_counter):
            answer += 1
    
    return answer