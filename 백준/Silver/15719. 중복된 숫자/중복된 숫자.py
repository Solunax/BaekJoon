import sys

n = int(input())
numbers = sys.stdin.read()

nSum = n * (n-1) // 2

sum = 0
string = ''
for num in numbers:
    if num.isdigit():
        string += num
    elif num == ' ':
        sum += int(string)
        string = ''

sum += int(string)

print(sum - nSum)
