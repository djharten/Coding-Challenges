a = int(input())

for k in range(a):
    b = input()
    c = input()
    str = ""
    for i in range(len(b)):
        if b[i] == c[i]:
            str += "."
        else:
            str += "*"
    print(b)
    print(c)
    print(str)
    print()
