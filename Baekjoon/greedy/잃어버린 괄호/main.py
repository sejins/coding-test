exp = input()

result = 0
keep = 0
cur = 0
cnt=0

for i in range(len(exp)-1,-1,-1):
  

  if exp[i]=='+':
    keep+=cur
    #print('cur :',cur)
    cur=0
    cnt=0
    continue
  
  if exp[i]=='-':
    result-=(cur+keep)
    #print('cur :',cur)
    keep=0
    cur=0
    cnt=0
    continue

  cur +=int(exp[i])*(10**cnt)
  if i==0:
    result+=(cur+keep)
  cnt+=1


print(result)