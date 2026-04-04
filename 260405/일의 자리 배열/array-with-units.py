list = [0] * 10
list[0], list[1] = map(int, input().split())

for i in range(2, 10):
    list[i] = list[i-1] + list[i-2]

[print(i%10, end=" ") for i in list]