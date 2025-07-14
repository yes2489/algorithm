t=int(input())
for i in range(t):
    arr=list(input().split())
    ans = float(arr[0])
    for j in range (1, len(arr)):
        if(arr[j] == '@'):
            ans *= 3
        elif(arr[j] == '%'):
            ans += 5
        else:
            ans -= 7
    print(f"{ans :.2f}")
    