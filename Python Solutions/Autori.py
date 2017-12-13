a = input()
b = a.split("-")
output = ""

for i in range(len(b)):
    c = b[i]
    output += c[0:1]

print(output)