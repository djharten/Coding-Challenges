a = list(input())
b = list(input())
length = 0
addBeg = ""

if len(a) > len(b):
    length = len(b)
    addBeg = a[0:len(a)-len(b)]
elif len(b) > len(a):
    length = len(a)
    addBeg = b[0:len(b)-len(a)]
else:
    length = len(a)

addBeg = ''.join(addBeg)

stringA = ""
stringB = ""

for i in range(1,length+1):
    if a[-i] == b[-i]:
        stringA = a[-i] + stringA
        stringB = b[-i] + stringB
    elif a[-i] > b[-i]:
        stringA = a[-i] + stringA
    elif b[-i] > a[-i]:
        stringB = b[-i] + stringB

if len(a) > len(b):
    stringA = str(addBeg) + stringA
elif len(b) > len(a):
    stringB = str(addBeg) + stringB

try:
    if stringA == "":
        stringA = 'YODA'
    elif int(stringA) == 0:
        stringA = '0'
except:
    hold = ""
try:
    if stringB == "":
        stringB = 'YODA'
    elif int(stringB) == int(0):
        stringB = '0'
except:
    hold = ""

print(stringA)
print(stringB)