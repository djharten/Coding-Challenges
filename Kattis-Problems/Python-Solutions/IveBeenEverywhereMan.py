a = int(input())

for i in range(a):
    b = int(input())
    arr = []
    for k in range(b):
        arr.append(input())
    c = set(arr)
    print(len(c))
    del arr