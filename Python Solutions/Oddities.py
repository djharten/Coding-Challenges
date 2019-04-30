a = int(input())

for i in range(a):
    b = int(input())
    if b % 2 == 0:
        print("{} is even".format(b))
    else:
        print("{} is odd".format(b))