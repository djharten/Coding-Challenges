a = int(input())

for i in range(a):
    b,c,d = map(int, input().split())
    if b > c-d:
        print('do not advertise')
    elif b < c-d:
        print('advertise')
    else:
        print('does not matter')