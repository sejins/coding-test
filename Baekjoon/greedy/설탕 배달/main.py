n = int(input())

count = 0

while True:
  if (n%5)==0:
    count+=(n//5)
    break
  n-=3
  count+=1

  if n==2 or n==1:
    count=-1
    break

print(count)