string = input()
ans = string[0] + 'a' + string[2:len(string)-2] + 'a' + string[-1:]
print(ans)