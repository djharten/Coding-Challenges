import re

a = str(input())
whitespace = re.sub(r'_', '', a)
wLen = (len(a) - len(whitespace)) / len(a)
lowerCase = re.sub(r'[a-z]','',a)
lowLen = (len(a) - len(lowerCase)) / len(a)
upperCase = re.sub(r'[A-Z]', '', a)
upLen = (len(a) - len(upperCase)) / len(a)

print(wLen)
print(lowLen)
print(upLen)
print(1-wLen-lowLen-upLen)