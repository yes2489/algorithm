import math

tc=int(input())
for _ in range(tc):
    a, b=map(int, input().split())
    # math.lcm -> 최소공배수
    ans = math.lcm(a, b)
    print(ans)
