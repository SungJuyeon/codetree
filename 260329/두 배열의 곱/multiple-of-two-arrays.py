a = []
while len(a) < 3:
    try:
        line = input().strip()
        if not line:
            continue
        a.append(list(map(int, line.split())))
    except EOFError:
        break

b = []
while len(b) < 3:
    try:
        line = input().strip()
        if not line:
            continue
        b.append(list(map(int, line.split())))
    except EOFError:
        break

# new_arr = []
# for i in range(3):
#     new_row = []
#     for j in range(3):
#         new_row.append(a[i][j] * b[i][j])
#     new_arr.append(new_row)

new_arr = [[a[i][j] * b[i][j] for j in range(3)] for i in range(3)]

for i in new_arr:
    print(*i)