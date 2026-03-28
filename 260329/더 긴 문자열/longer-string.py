a, b = map(str, input().split());
if len(a) > len(b):
    print(f"{a} {len(a)}")
elif len(a) < len(b):
    print(f"{b} {len(b)}")
else:
    print("same")