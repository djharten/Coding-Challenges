a = int(input())
b = list(input())
adrianSeq = list('ABC') * 34
brunoSeq = list('BABC') * 25
goranSeq = list('CCAABB') * 17
adrianR, brunoR, goranR = 0,0,0

for i in range(a):
    if b[i] == adrianSeq[i]:
        adrianR += 1
    if b[i] == brunoSeq[i]:
        brunoR += 1
    if b[i] == goranSeq[i]:
        goranR += 1

if adrianR > brunoR and adrianR > goranR:
    print(adrianR)
    print('Adrian')
elif brunoR > adrianR and brunoR > goranR:
    print(brunoR)
    print('Bruno')
elif goranR > adrianR and goranR > brunoR:
    print(goranR)
    print('Goran')
elif adrianR == brunoR and adrianR > goranR:
    print(adrianR)
    print('Adrian')
    print('Bruno')
elif adrianR == goranR and adrianR > brunoR:
    print(adrianR)
    print('Adrian')
    print('Goran')
elif brunoR == goranR and brunoR > adrianR:
    print(brunoR)
    print('Bruno')
    print('Goran')
elif adrianR == brunoR and adrianR == goranR:
    print(adrianR)
    print('Adrian')
    print('Bruno')
    print('Goran')