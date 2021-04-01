import sys

t = int(input())
#test_case = []

for _ in range(t):
    emp = []
    n = int(input())

    for _ in range(n):
        a,b = map(int,sys.stdin.readline().split())
        emp.append((a,b))
    #print(emp)
    emp = sorted(emp,key=lambda x : x[0])
    temp=999999
    count = 0

    for e in emp:
        if e[1]==1:
            count+=1
            break

        if e[1]<temp:
            temp=e[1]
            count+=1
    print(count)
