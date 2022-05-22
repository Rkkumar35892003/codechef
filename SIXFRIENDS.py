from math import *
t = int(input())
for i in range(t):
    x,y = map(int,input().split())
    dcost = x*3
    tcost = y*2
    res = min(dcost,tcost)
    print(res)