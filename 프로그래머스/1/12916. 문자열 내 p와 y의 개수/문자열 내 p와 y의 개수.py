def solution(s):
    letter = s.lower()
    p = 0
    y = 0
    for i in letter:
        if i == 'p':
            p += 1
        elif i == 'y':
            y += 1

    if p == y or p == y == 0:
        return True
    else:
        return False