a = int(input())

for i in range(a):
    b = input()
    if b[0:10] == 'Simon says':
        print(b[11::])