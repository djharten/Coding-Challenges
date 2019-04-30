a,b, = map(int, input().split())

round = int(pow(10,b))
roundNumber = float((a+(0.5*round) / (1*round) * (1*round)))
a = int(roundNumber / round) * round;

print(a)