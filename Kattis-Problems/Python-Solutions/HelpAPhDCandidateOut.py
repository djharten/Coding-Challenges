a = int(input())

for i in range(a):
    try:
        b,c = map(int, input().split("+"))
        print(b+c)
    except:
        print('skipped')