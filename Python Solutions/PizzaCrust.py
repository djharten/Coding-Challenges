import cmath

a,b = map(int, input().split())
b = a - b
a = cmath.pi * pow(a,2)
print(((cmath.pi * pow(b,2)) / a)*100)