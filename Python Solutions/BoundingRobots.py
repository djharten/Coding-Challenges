wid,len = map(int,input().split())

wLocReal = 0
lLocReal = 0
wLocRobot = 0
lLocRobot = 0

while wid != 0 and len != 0:

    numSeg = int(input())

    for i in range(numSeg):

            letter,move = input().split()
            move = int(move)

            if letter == 'u':
                lLocRobot += move
                lLocReal += move
            elif letter == 'd':
                lLocRobot -= move
                lLocReal -= move
            elif letter == 'r':
                wLocRobot += move
                wLocReal += move
            else:
                wLocRobot -= move
                wLocReal -= move

            if lLocReal >= len:
                lLocReal = len - 1
            if wLocReal >= wid:
                wLocReal = wid - 1
            if lLocReal <= 0:
                lLocReal = 0
            if wLocReal <= 0:
                wLocReal = 0;

    print('Robot thinks', wLocRobot, lLocRobot)
    print('Actually at', wLocReal, lLocReal)
    print()

    lLocRobot = 0
    wLocRobot = 0
    lLocReal = 0
    wLocReal = 0

    wid, len = map(int, input().split())