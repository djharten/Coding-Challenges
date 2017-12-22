a = int(input())

for i in range(a):
    arr = list(map(int, input().split()))
    numArr = arr[0]
    arr.remove(arr[0])
    sum = 0

    for k in range(numArr):
        sum += arr[k]

    avg = sum/numArr
    count = 0

    for j in range(numArr):
        if arr[j] > avg:
            count+=1

    print('%.3f' % ((count/numArr) * 100 )+ '%')