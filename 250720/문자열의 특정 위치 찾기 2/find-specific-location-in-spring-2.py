# fruits = ['apple', 'banana', 'grape', 'bluberry', 'orange']
# char = input()
# cnt = 0
# for fruit in fruits:
#     if len(fruit) > 3 and (fruit[2] == char or fruit[3] == char):
#         print(fruit)
#         cnt += 1
# print(cnt)

fruits = ['apple', 'banana', 'grape', 'bluberry', 'orange']

char = input()
cnt = 0

for i in range(5):
	if fruits[i][2] == char or fruits[i][3] == char:
		print(fruits[i])
		cnt += 1

print(cnt)