a = int(input())
for i in range(a):
    b,c = map(float,input().split())
    bpm = (60*b)/c
    delta = bpm/b
    #This is a better way to print out the answer, but Kattis does not support Python 3.6 as of writing this.
    #print(f'{bpm-delta:.4f} {bpm:.4f} {bpm+delta:.4f}')
    print('%.4f' % (bpm-delta), '%.4f' % bpm, '%.4f' % (bpm+delta))