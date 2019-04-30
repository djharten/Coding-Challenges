cases = int(input())
for i in range(cases):
    a,b,c = map(int,input().split())
    if a+b==c or a-b==c or a*b==c or a/b==c or b-a==c or b/a==c:
        print('Possible')
    else:
        print('Impossible')