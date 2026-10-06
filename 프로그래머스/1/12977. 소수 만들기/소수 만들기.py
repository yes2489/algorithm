from itertools import combinations

def solution(nums):
    answer = 0
    
    for c in combinations(nums, 3):
        if is_prime(sum(c)):
            answer += 1
            
    return answer

def is_prime(n):
    if (n < 2):
        return False
    
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    
    return True