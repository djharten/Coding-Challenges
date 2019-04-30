a,b = map(int,input().split())
arr = [int(i) for i in input().split()]
sum = 0
for i in range(a):
    sum += arr[i]
    if sum > b:
        i-=1
        break
print(i+1)