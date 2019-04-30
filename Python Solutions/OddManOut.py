a = int(input())

for i in range(a):
    b = int(input())
    c = map(int,input().split())
    odd = 0

    for ck in c:
        odd ^= ck

    print('Case #' + str(i+1) + ':', odd)