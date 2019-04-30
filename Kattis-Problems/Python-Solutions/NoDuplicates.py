import sys

arr = list(input().split())
arr.sort()
for i in range(len(arr)-1):
    if(arr[i] == arr[i+1]):
        print('no')
        sys.exit()

print('yes')