a = int(input())
arrSchool = []
arrWinners = []
for i in range(a):
    b,c = input().split()
    fullName = (b + ' ' + c)
    if b not in arrSchool:
        arrWinners.append(fullName)
        arrSchool.append(b)
    else:
        continue

for k in range(12):
    print(arrWinners[k])