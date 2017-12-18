import sys

a = input()
for i in range(len(a)-1):
    if a[i:i+2] == 'ss':
        print('hiss')
        sys.exit()
print('no hiss')