n=int(input())
#모든 수는 1로 나누어떨어지기때문에 2부터 시작
d=2

while(n!=1):
    if(n%d==0):
        # n이 d로 나누어지면 n값을 d로 나눈 몫으로 변경
        n = n//d
        print(d)
    else:
        # d값 1 증가
        d += 1