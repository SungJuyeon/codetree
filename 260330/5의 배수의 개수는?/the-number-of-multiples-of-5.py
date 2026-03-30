cnt = 0
for _ in range(4):
    a = list(map(int, input().split()))

    for num in a:
        if num % 5 == 0:
            cnt+=1

print(cnt)
    
