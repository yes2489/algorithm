m, n = map(int, input().split())

def solution(num):
    # 1은 소수가 아님
    if num == 1:
        return False
    else:
        # 2부터 num의 제곱근+1까지
        for i in range(2, int(num ** 0.5) + 1):
            # i로 나누어 떨어지면 소수가 아님
            if num % i == 0:
                return False
        return True
    

for i in range(m, n+1):
    if solution(i):
        print(i) 