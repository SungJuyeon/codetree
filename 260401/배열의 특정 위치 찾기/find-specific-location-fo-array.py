a = list(map(int, input().split()))
even = 0
for i in range(1, 10, 2):
    even += a[i]

avg = 0
for i in range(2, 10, 3):
    avg += a[i]
avg = round(avg/3, 1)

print(even, avg)