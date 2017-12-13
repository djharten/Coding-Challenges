a = input()
loc = 1

for i in range(len(a)):
    move = a[i:i+1]
    if(move == 'A' and loc == 1):
        loc = 2
    elif(move =='A' and loc == 2):
        loc = 1
    elif(move == 'B' and loc == 2):
        loc = 3
    elif(move == 'B' and loc == 3):
        loc = 2
    elif(move == 'C' and loc == 1):
        loc = 3
    elif(move == 'C' and loc == 3):
        loc = 1
    else:
        continue

print(loc)