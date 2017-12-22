a = int(input())
for i in range(a):
    b = int(input())
    passengers = 0
    for i in range(b):
        passengers = (int)(2*(passengers+0.5))
    print(passengers)