a,b,c,d,e = map(int, input().split())

while(True):
    if a>b:
        a,b = b,a
        print(str(a), str(b), str(c), str(d), str(e))
    if b>c:
        b,c = c,b
        print(str(a), str(b), str(c), str(d), str(e))
    if c>d:
        c,d = d,c
        print(str(a), str(b), str(c), str(d), str(e))
    if d>e:
        d,e = e,d
        print(str(a), str(b), str(c), str(d), str(e))
    if e-d == 1 and d-c == 1 and c-b == 1 and b-a == 1:
        break