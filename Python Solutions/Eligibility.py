a = int(input())
for i in range(a):
    arr = list(input().split())
    arrTwo = list(arr[1].split("/"))
    arrThree = list(arr[2].split("/"))

    if int(arrTwo[0]) >= 2010 or int(arrThree[0]) >= 1991:
        print(arr[0] + ' eligible')
    elif int(arr[3]) > 40:
        print(arr[0] + ' ineligible')
    else:
        print(arr[0] + ' coach petitions')