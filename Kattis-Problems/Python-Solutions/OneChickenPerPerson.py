a,b = map(int, input().split())
c = abs(a-b)
if a == b+1:
    print('Dr. Chaz needs ' + str(c) + ' more piece of chicken!')
elif a > b:
    print('Dr. Chaz needs ' + str(c) + ' more pieces of chicken!')
elif a+1 == b:
    print('Dr. Chaz will have ' + str(c) + ' piece of chicken left over!')
elif b > a:
    print('Dr. Chaz will have ' + str(c) + ' pieces of chicken left over!')