# cook your dish here
n = int(input())
for i in range(n):
    x,y = map(int,input().split())
    if(x!=y) or (x==0 and y==0):
        print("NO")
    else:
        print("YES")