# cook your dish here

for i in range(int(input())):
    x,y = map(int,input().split())
    count = 0
    for j in range(x,y+1):
        rem = j%10;
        if(rem == 2 or rem == 3 or rem ==9):
            count += 1
    print(count)        