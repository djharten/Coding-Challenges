a = list(input())
i = 0
newWord = list()

for i in range(len(a)):
    if a[i] == '<':
        if len(newWord) > 0:
            del newWord[len(newWord)-1]
    else:
        newWord.append(a[i])

word = ''.join(newWord)
print(word)