def solution(n):
    sqrt = n ** (1/2) # `**(1/2)`: 제곱근
    
    if sqrt % 1 == 0:
        return(sqrt+1)**2
    return -1
