# cook your dish here
for i in range(int(input())):
    a,b,x,y = map(int,input().split())
    moon = a*b
    power = x*y
    if(power>=moon):
        print("Yes")
    else:
        print("No")
        