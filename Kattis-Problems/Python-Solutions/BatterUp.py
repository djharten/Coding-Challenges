a = int(input())
arr = list(map(int, input().split()))
total = 0

for i in range(a):
    if arr[i] == -1:
        a-=1
        total += 1

total += sum(arr)
avg = total/a
print(avg)