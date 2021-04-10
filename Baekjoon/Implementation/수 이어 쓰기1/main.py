n = input()
length = len(n)
num = int(n)

j_sum = [0]*10

for i in range(1,length):
    if i == 1:
        j_sum[1] = 9
    else:
        tmp = (10**i)-1
        for j in range(1,i):
            tmp-=j_sum[j]
        j_sum[i]=tmp

j_sum[length] = num-(10**(length-1))+1

result = 0

for i in range(1,len(j_sum)):
    result+=(i*j_sum[i])

print(result)


