import math
def solution(n):
    x = int(math.sqrt(n))
    if n == math.pow(x,2):
        return int(math.pow(x+1,2))
    else:
        return -1
    