a,b = input().split()
sum = 0
for i in range(int(a)*4):
    c = input()
    card = c[0]
    suit = c[1]

    if card == 7 or card == 8:
        continue
    elif card == "Q":
        sum += 3
    elif card == 'K':
        sum += 4
    elif card == 'A':
        sum += 11
    elif card == 'T':
        sum += 10
    elif card == '9':
        if suit == b:
            sum += 14
    elif card == 'J':
        if suit == b:
            sum+= 20
        else:
            sum += 2
print(sum)