# cook your dish here
for i in range(int(input())):
    n,x = map(int,input().split())
    if x%n==0:
        print("YES")
    else:
        print("NO")