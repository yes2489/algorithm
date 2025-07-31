def solution(mats, park):
    # 가장 큰 돗자리부터 시도
    mats.sort(reverse=True)
    
    for mat in mats:
        for i in range(len(park)):
            for j in range(len(park[0])):
                if find_place(i, j, mat, park):
                    # 제일 큰 돗자리 찾으면 바로 반환
                    return mat
    return -1 # 없으면 -1


def find_place(x, y, mat, park):
    r = x+mat
    c = y+mat
    if r > len(park) or c > len(park[0]):
        return False # 범위 이탈
    else:
        for i in range(x, r):
            for j in range(y, c):
                if park[i][j] != '-1':
                    return False # 중간에 막혀서 돗자리 깔 수 없음
        return True