a = int(input())
arr = [input() for i in range(a)]
sum = 0

for k in range(a):
    first = arr[k]
    second = arr[k]
    first = first[0:len(first)-1]
    second = second[len(second)-1:len(second)]
    sum += pow(int(first), int(second))

print(sum)