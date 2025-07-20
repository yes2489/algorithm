n = int(input())
ans=[]
for score in range(n, 101):
    if score >= 90:
        ans.append('A')
    elif score >= 80:
        ans.append('B')
    elif score >= 70:
        ans.append('C')
    elif score >= 60:
        ans.append('D')
    else:
        ans.append('F')
print(*ans)