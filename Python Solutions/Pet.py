sum = 0
guest = 0

for i in range(5):
    a,b,c,d = map(int, input().split())
    if a+b+c+d > sum:
        sum = a+b+c+d
        guest = int(i)+1

print(guest,sum)
