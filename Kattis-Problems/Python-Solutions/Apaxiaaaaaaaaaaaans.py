a = list(input())
x = 0
num = len(a)-1
for i in range(num):
    if a[x] == a[x+1]:
        del a[x+1]
        num += 1
    else:
        x+=1
a = ''.join(a)
print(a)