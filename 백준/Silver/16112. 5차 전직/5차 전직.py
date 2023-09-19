import sys

n, k = map(int, sys.stdin.readline().split())
quest = list(map(int, sys.stdin.readline().split()))
quest.sort()
total = 0

for i in range(1, n):
    if i < k:
        total += quest[i] * i
    else:
        total += quest[i] * k

print(total)
