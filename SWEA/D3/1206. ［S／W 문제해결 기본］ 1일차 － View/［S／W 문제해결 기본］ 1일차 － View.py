# 10개의 테스트케이스
for tc in range(1, 11):
    # 건물 수
    n = int(input())
    
    # 건물의 높이
    buildings = list(map(int, input().split()))
    
    res = 0
    # 순회 하면서 내 양 옆이 비었는지 확인
    for i in range(2, n-2):
        neighbors = [buildings[i-2], buildings[i-1], buildings[i+1], buildings[i+2]]
        max_neighbor = max(neighbors)
        if buildings[i] > max_neighbor:
            res += buildings[i] - max_neighbor
            
    print(f'#{tc} {res}')