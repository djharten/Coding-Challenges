arr = list(map(int,input().split()))
arr.sort()
if(abs(arr[0]-arr[1]) == abs(arr[1]-arr[2])):
    print(arr[2]+abs(arr[0]-arr[1]))
elif(abs(arr[0]-arr[1]) > abs(arr[1]-arr[2])):
    print(arr[0] + abs(arr[1]-arr[2]))
else:
    print(arr[1] + abs(arr[0]-arr[1]))