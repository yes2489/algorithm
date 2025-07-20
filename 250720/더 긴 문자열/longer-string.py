str1, str2 = input().split()

if len(str1) == len(str2):
    print('same')
elif len(str1) > len(str2):
    print(str1, len(str1))
else:
    print(str2, len(str2))
