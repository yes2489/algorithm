def solution(a, b):
    # zip(a, b)는 a와 b의 같은 인덱스 요소들을 짝지어 튜플로 반환
    # 각 튜플(x, y)에 대해 x*y 곱셈을 수행하고, 그 결과를 모두 더함
    return sum([x*y for x, y in zip(a,b)])