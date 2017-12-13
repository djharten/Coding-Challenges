a,b,c = map(int, input().split())
for i in range(a):
    d = int(input())
    if pow(b,2) + pow(c,2) >= pow(d,2):
        print('DA')
    else:
        print('NE')