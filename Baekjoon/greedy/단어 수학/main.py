n = int(input())

alp = {}
mapping = {}

result = 0


for _ in range(n):
    st = input()
    for i in range(len(st)):  
        zari = 10**(len(st)-1-i)
        if st[i] not in alp:
            alp[st[i]] = zari
        else:
            alp[st[i]] += zari 

#print(alp)

alp = sorted(alp.items(),key = lambda x : x[1],reverse=True)

#print(type(alp))

num = 9

for a in alp:
    result += a[1]*num
    num-=1

print(result)