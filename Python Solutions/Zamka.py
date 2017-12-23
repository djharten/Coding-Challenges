a = int(input())
b = int(input())
c = int(input())

minNum = a
maxNum = b
minSum = 0
maxSum = 0

while True:
    keepMin = minNum
    keepMin += 1

    while minNum > 0:
        minSum += minNum % 10
        minNum //= 10

    if minSum == c:
        break
    else:
        minSum = 0
        minNum = keepMin

while True:
    keepMax = maxNum
    keepMax -= 1

    while maxNum > 0:
        maxSum += maxNum % 10
        maxNum //= 10

    if maxSum == c:
        break
    else:
        maxSum = 0
        maxNum = keepMax

print(keepMin-1)
print(keepMax+1)