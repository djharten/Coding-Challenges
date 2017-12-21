boxLoc = int(input())
numQuestions = int(input())
sum = 0
finalLoc = 0

for i in range(numQuestions):
    time,answer = input().split()
    if answer == 'T':
        sum += int(time)
        boxLoc += 1
        if sum > 210:
            boxLoc -= 1
    else:
        sum += int(time)

    if boxLoc == 9:
            boxLoc = 1

print(boxLoc)