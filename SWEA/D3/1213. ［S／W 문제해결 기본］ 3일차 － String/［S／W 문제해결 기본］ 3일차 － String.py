for t in range(1, 11):
    input()
    word = input()
    str = input()
    ans = 0
    for i in range(len(str)):
        if str[i] == word[0]:
            if str[i:i+len(word)] == word:
                ans += 1
                
    print(f'#{t} {ans}')