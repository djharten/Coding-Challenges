import sys
a,b,c = map(int, input().split())

if a + b == c:
    print(str(a) + '+' + str(b) + '=' + str(c))
    sys.exit()
elif a == b + c:
    print(str(a) + '=' + str(b) + '+' + str(c))
    sys.exit()
elif a - b == c:
    print(str(a) + '-' + str(b) + '=' + str(c))
    sys.exit()
elif a == b - c:
    print(str(a) + '=' + str(b) + '-' + str(c))
    sys.exit()
elif a * b == c:
    print(str(a) + '*' + str(b) + '=' + str(c))
    sys.exit()
elif a == b*c:
    print(str(a) + '=' + str(b) + '*' + str(c))
    sys.exit()
elif a / b == c:
    print(str(a) + '/' + str(b) + '=' + str(c))
    sys.exit()
else:
    print(str(a) + '=' + str(b) + '/' + str(c))
    sys.exit()