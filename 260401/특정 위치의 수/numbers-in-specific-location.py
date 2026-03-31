a = list(map(int, input().split()))
total = 0
# for i in range(len(a)):
#     if i in (2,4,9):
#         total += a[i]
    
for i in range(len(a)):
    if i == 2 or i == 4 or i == 9:
        total += a[i]
print(total)