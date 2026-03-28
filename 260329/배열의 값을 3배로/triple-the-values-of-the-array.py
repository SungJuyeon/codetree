arr = []
for _ in range(3):
    row = list(map(int, input().split()))
    arr.append(row)

for row in arr:
    for i in row:
        print(i*3, end=" ")
    print()