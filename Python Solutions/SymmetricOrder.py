a = int(input())
setNum = 1
while a != 0:
    arr = []
    for i in range(a):
        arr.append(input())

    count = 1

    for k in range(1,int(a/2)+1):
        arr.insert(len(arr)-count, arr.pop(k))
        count += 1

    print('SET',setNum)
    setNum += 1

    for j in range(a):
        print(arr[j])

    a = int(input())



