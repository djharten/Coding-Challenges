a = int(input())
for i in range(a):
    b,c = map(int, input().split())
    totalSum = c*(c+1)/2
    evenSum = ((2*c)*(c+1))/2
    oddSum = pow(c,2)
    print(b,int(totalSum),int(oddSum),int(evenSum))