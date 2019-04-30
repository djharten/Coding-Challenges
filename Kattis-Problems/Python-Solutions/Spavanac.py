a,b = map(int, input().split())

if b - 45 < 0 and a != 0:
    a -= 1
    b = 60 - abs(b-45)
elif b - 45 < 0 and a == 0:
    a = 23
    b = 60- abs(b-45)
else:
    b -= 45

print(a,b)