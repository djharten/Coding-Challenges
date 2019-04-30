a = int(input())
wins = a
for i in range(a):
    b = input()
    for k in range(len(b)-1):
        if b[k] == 'C' and b[k+1] == 'D':
            wins -= 1
            break;
print(wins)