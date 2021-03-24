n,remain = list(map(int,input().split()))

coins = []

for _ in range(n):
    coins.append(int(input()))


count = 0

coins.sort(reverse=True)  

while remain>0:
    for c in coins:
        if remain>=c:
        
            count+=(remain//c)
            remain%=c
            break


print(count)