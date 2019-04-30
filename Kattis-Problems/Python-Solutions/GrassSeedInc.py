a = float(input())
b = int(input())
sum = 0
for i in range(b):
    c,d = map(float, input().split())
    sum += (c*d)*a
print(sum)
