import math, cmath

a,b = map(int,input().split())
rads = b*(cmath.pi / 180)
cos = (1/cmath.sin(rads))

ladder = math.ceil(cos.real*a)
print(ladder)