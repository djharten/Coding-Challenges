sEmpty, sFound, sCost = map(int, input().split())
sum = (sEmpty + sFound) // sCost
remainder = ((sEmpty + sFound) % sCost) + sum
while remainder >= sCost:
    sum += remainder//sCost
    tempSum = remainder//sCost
    tempRemainder = remainder-(tempSum*sCost)
    remainder = tempSum + tempRemainder
print(sum)