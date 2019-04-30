a, b = map(int, input().split())
while(True):
    print(abs(a-b))
    try:
        a, b = map(int, input().split())
    except:
        break