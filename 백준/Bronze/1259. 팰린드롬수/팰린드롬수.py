while True:
    n = list(map(int, input().strip()))
    
    if n == [0]:
        break
    
    r_n = n[::-1]
    
    is_palindrome = 'yes'
    
    for i in range(len(n)):
        if n[i] != r_n[i]:
            is_palindrome = 'no'
            break
        
    print(is_palindrome)
    