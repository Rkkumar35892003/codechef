# cook your dish here
for i in range(int(input())):
    x,y = map(int,input().split())
    if(x<y):
        dif = y-x
        print(dif)
    elif(x>=y):
        dif = x-y
        print(dif)
