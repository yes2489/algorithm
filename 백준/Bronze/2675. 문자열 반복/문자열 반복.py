t=int(input())
for i in range(t):
    arr=input().split()
    r=int(arr[0])
    s=arr[1]
    ans=''
    for j in s:
        ans += j*r
    print(ans)