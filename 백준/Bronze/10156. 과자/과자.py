K, N, M = map(int, input().split())
total=K*N
if(total-M > 0):
    print(total-M)
else:
    print(0)