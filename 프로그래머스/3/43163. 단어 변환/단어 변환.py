from collections import deque

def check_words(a, b):
    diff = sum(1 for x, y in zip(a, b) if x != y)
    return diff == 1

def solution(begin, target, words):
    
    if target not in words:
        return 0
    
    q = deque()
    q.append((begin, 0))
    visited = set()
    
    while q:
        word, cnt = q.popleft()
        if word == target:
            return cnt
        
        for w in words:
            if w not in visited and check_words(word, w):
                q.append((w, cnt+1))