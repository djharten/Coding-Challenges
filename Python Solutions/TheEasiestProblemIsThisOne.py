a = int(input())

while a != 0:
    sum = 0
    aCopy = a
    while aCopy > 0:
        sum += aCopy % 10
        aCopy //= 10
    count = 0
    newCount = 11
    newSum = 0
    while sum != newSum:
        count = a * newCount
        newCount += 1
        newSum = 0
        while(count > 0):
            newSum += count % 10
            count //= 10
    print(newCount-1)
    a = int(input())