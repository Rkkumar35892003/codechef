# cook your dish here
for i in range(int(input())):
    x,y,m = map(int,input().split())
    rent = x*m
    if(rent<y):
        print("YES")
    else:
        print("NO")
        