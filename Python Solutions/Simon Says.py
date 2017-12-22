a = int(input())

for i in range(a):
    b = input()
    if b[0:10] == 'simon says':
        print(b[11::])
    else:
        print()