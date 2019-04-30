bAge, bRetire, bSave, aAge, aSave = map(int,input().split())
bTotal = (bRetire-bAge) * bSave
aTotal = 0
while(bTotal >= aTotal):
    aTotal += aSave
    aAge += 1
print(aAge)