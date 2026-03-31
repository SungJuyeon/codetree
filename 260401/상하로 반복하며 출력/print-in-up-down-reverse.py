a = int(input())
arr = [[0]*a for _ in range(a)]
for i in range(a):
    if i % 2 != 0:
        for j in range(a):
            arr[j][i] = a - j
    else:
        for j in range(a):
            arr[j][i] = j+1

for row in arr:
    print(*row, sep="")
        