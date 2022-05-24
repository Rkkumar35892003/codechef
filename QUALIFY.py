# cook your dish here
for i in range(int(input())):
    x,a,b = map(int,input().split())
    s = a+(b*2)
    if(s>=x):
        print("Qualify")
    else:
        print("NotQualify")