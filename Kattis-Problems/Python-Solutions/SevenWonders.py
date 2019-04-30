a = input()
t,g,c = 0,0,0
sum = 0
count = 1

for i in range(len(a)):
    if a[i] == 'T':
        t+=1
    elif a[i] == 'G':
        g+=1
    else:
        c+=1

    if t >= count and g >= count and c >= count:
        sum += 7
        count+=1

sum += pow(t,2) + pow(c,2) + pow(g,2)
print(sum)