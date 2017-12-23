from operator import itemgetter

a = int(input())
pairs = list()
for i in range(a):
    pairs.append(input().split())

for k in range(a):
    makeNum = 0

    try:
        makeNum = int(pairs[k][1])
        pairs[k][0], pairs[k][1] = pairs[k][1], pairs[k][0]
        pairs[k][0] = int(pairs[k][0])*2
    except:
        pairs[k][0] = int(pairs[k][0])
        continue

pairs.sort()

for j in range(a):
    print(pairs[j][1])
