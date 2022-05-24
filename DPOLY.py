# cook your dish here
for i in range(int(input())):
    n = int(input())
    l = list(map(int,input().split()))
    l.reverse()
    for i in range(len(l)):
        if l[i] == 0:
            n = n-1
        else:
            break
    print(n-1)    