fruits = ['apple', 'banana', 'grape', 'bluberry', 'orange']
char = input()
cnt = 0
for fruit in fruits:
    if len(fruit) > 3 and (fruit[2] == char or fruit[3] == char):
        print(fruit)
        cnt += 1
print(cnt)
