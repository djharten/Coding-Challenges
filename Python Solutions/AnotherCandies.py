a = int(input())
arr = []
for i in range(a):
    blank = input()
    b = int(input())
    total = 0

    for k in range(b):
        total += int(input())

    if total % b == 0:
        print('YES')
    else:
        print('NO')