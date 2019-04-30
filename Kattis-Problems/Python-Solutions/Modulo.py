arr = list()

for i in range(10):
    a = int(input()) % 42
    arr.append(a)

b = set(arr)
print(len(b))