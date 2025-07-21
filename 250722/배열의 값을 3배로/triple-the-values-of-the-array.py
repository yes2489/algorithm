arr = [list(map(int, input().split())) for _ in range(3)]
# 각 요소를 3배로 곱한 새로운 2차원 리스트로 갱신
arr = [[num * 3 for num in row] for row in arr]

# 각 행을 순회하면서 요소들을 공백으로 구분해 출력
for row in arr:
    print(*row)  # *row는 unpacking으로, 리스트의 요소를 공백으로 구분해 한 줄로 출력