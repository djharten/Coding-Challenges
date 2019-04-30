a = int(input())

while a != -1:
    arrMPH = []
    arrTime = []

    for i in range(a):
        b,c = map(int,input().split())
        arrMPH.append(b)
        arrTime.append(c)

    miles = 0

    for k in range(1,a):
        timeDif = arrTime[-k] - arrTime[-k-1]
        miles += timeDif * arrMPH[-k]

    miles += arrMPH[0]*arrTime[0]
    print(miles,'miles')

    a = int(input())