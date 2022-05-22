# cook your dish here
t = int(input())
for i in range(t):
    p = int(input())
    p = list(input().split())
    start38,ltime108 = 0,0
    for j in p:
        if j == "START38":start38 += 1
        elif j == "LTIME108":ltime108 += 1
    print(start38,ltime108)    