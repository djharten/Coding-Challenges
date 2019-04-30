arrNum = list(map(int, input().split()))
arrLet = list(input())
arrNum.sort()
arrAns = []
for i in range(3):
    if arrLet[i] == 'A':
        arrAns.append(arrNum[0])
    elif arrLet[i] == 'B':
        arrAns.append(arrNum[1])
    else:
        arrAns.append(arrNum[2])
print(str(arrAns[0]) + ' ' + str(arrAns[1]) + ' ' + str(arrAns[2]))