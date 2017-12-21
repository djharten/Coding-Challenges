import sys
x1, y1, x2, y2, p = map(float, input().split())
while(True):
    dist = pow(pow(abs(x1-x2),p) + pow(abs(y1-y2),p),1/p)
    print(dist)
    try:
        x1, y1, x2, y2, p = map(float, input().split())
    except:
        sys.exit()