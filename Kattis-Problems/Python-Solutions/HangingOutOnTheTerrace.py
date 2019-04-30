a,b = map(int, input().split())
sum = 0
groups = 0

for i in range(b):
    c,d = input().split()
    if c == 'enter':
        sum += int(d)
        if sum > a:
            sum -= int(d)
            groups += 1
    else:
        sum -= int(d)

print(groups)