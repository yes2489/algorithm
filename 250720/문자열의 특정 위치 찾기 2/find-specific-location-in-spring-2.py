# fruits = ['apple', 'banana', 'grape', 'bluberry', 'orange']
# char = input()
# cnt = 0
# for fruit in fruits:
#     if len(fruit) > 3 and (fruit[2] == char or fruit[3] == char):
#         print(fruit)
#         cnt += 1
# print(cnt)

string = ["apple", "banana", "grape", "blueberry", "orange"]

a = input()
cnt = 0

for i in range(5):
	if string[i][2] == a or string[i][3] == a:
		print(string[i])
		cnt += 1

print(cnt)
