a = int(input())
for i in range(a):
    b = int(input())
    if b % 400 == 0:
        b //= 400
        print(b)
    else:
        b //= 400
        print(b+1)
