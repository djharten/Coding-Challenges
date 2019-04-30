a = int(input())

for k in range(a):

    count = 0
    arr = list(map(int, input().split()))
    numArr = arr[0]
    arr.remove(arr[0])

    for i in range(numArr-2):
        if arr[len(arr)-1-i] - arr[len(arr)-2-i] == arr[len(arr)-2-i]- arr[len(arr)-3-i]:
            count += 1

    if count == numArr-2:
        print('arithmetic')
        continue
    else:
        count = 0
        arr.sort()

        for j in range(numArr-2):
            if arr[len(arr)-1-j] - arr[len(arr)-2-j] == arr[len(arr)-2-j] - arr[len(arr)-3-j]:
                count += 1

        if count == numArr-2:
            print('permuted arithmetic')
            continue
        else:
            print('non-arithmetic')
