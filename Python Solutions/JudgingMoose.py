a,b = map(int, input().split())
if a==b and a != 0 and b != 0:
    print('Even ' + str(a+b))
elif a>b:
    print('Odd ' + str(a*2))
elif b>a:
    print('Odd ' + str(b*2))
else:
    print('Not a moose')