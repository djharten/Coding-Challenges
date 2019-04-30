a,b = map(int, input().split())
c,d = map(int, input().split())
e,f = map(int, input().split())

if a-c == 0:
    print(str(e) + ' ', end='')
elif c-e == 0:
    print(str(a) + ' ', end='')
else:
    print(str(c) + ' ', end='')

if b-d == 0:
    print(str(f))
elif d-f == 0:
    print(str(b))
else:
    print(str(d))