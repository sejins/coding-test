n = int(input())

times = [[0]*2 for _ in range(n)]

for i in range(n):
    times[i][0],times[i][1] = list(map(int,input().split()))

times = sorted(times,key= lambda x : (x[1],x[0]))

count = 0

fin_time = 0

for i in range(len(times)):
    if times[i][0]>=fin_time:
        count+=1
        fin_time = times[i][1]

print(count)