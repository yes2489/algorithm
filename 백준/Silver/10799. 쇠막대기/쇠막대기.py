import sys
input = sys.stdin.readline

arr = list(input().strip())
stack = []
cnt = 0

for i in range(len(arr)):
    # 열린 괄호일 경우 stack.append 
    if arr[i] == '(':
        stack.append(arr[i])
    
    # 닫힌 괄호일 경우 stack.pop(), '('만큼 cnt++
    else:
        stack.pop()
        if arr[i-1] == '(': # 레이저인 경우 ()
            cnt += len(stack)
        else:
            cnt += 1 # 막대의 끝인 경우 ))
print(cnt)