a = list(map(int, input().split()))
odd = 0
even = 0
for i in range(1, 10, 2):
    odd += a[i]

for i in range(0, 10, 2):
    even += a[i]

if odd > even:
    print(odd - even)
else:
    print(even - odd)