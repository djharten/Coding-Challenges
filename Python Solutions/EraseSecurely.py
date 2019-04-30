a = int(input())
b = input()
c = input()
d = ""

for i in range(a):
    d = ""
    for k in range(len(c)):
        if b[k] == '1':
            d += b[k].replace('1', '0')
        else:
            d += b[k].replace('0', '1')
    b = d

if d == c:
    print('Deletion succeeded')
else:
    print('Deletion failed')
