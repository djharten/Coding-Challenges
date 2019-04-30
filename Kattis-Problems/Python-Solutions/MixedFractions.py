a,b = map(int, input().split())

while a != 0 and b != 0:
    c = a//b
    d = a % b
    print(str(c) + ' ' + str(d) + ' / ' + str(b))
    a, b = map(int, input().split())