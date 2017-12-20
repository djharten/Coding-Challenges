def getInputAndSum():
    a,b,c,d = map(int, input().split())
    sum = a+b+c+d
    return sum

def findWinner(gunnarSum, emmaSum):
    if(gunnarSum > emmaSum):
        print('Gunnar')
    elif(emmaSum > gunnarSum):
        print('Emma')
    else:
        print('Tie')

gunnar = getInputAndSum()
emma = getInputAndSum()
findWinner(gunnar,emma)