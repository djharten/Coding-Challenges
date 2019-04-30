a = list(input())
count = 0
days = 0
for i in range(len(a)):
    if count == 0:
        if a[i] != 'P':
            days += 1
    elif count == 1:
        if a[i] != 'E':
            days += 1
    elif count == 2:
        if a[i] != 'R':
            days += 1

    if count == 2:
        count = 0
    else:
        count += 1

print(days)