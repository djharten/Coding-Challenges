import math, sys;

a = int(input())
b = set()

for i in range(2, math.ceil(math.sqrt(a))+1):
    if a % i == 0:
        b.add(i-1)
        if i != a/i:
            b.add((a/i)-1)


c = iter(sorted(b))

print(0, end="")

for k in c:
    k = " " + str(int(k))
    sys.stdout.write(k)

print('', a-1)