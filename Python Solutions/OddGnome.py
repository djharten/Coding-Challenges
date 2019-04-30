a = int(input())

for i in range(a):
    arr = list(map(int, input().split()))
    for k in range(1, arr[0]):
        if arr[k]+1 != arr[k+1]:
            print(k+1)
            break