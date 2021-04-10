import sys
import heapq
n = int(input())

table = {}
h = []
for _ in range(n):
    num = int(sys.stdin.readline().rstrip())
    if num > 0:
        heapq.heappush(h,num)
    elif num < 0:
        if -num not in table:
            table[-num] = 1
        else:
            table[-num]+=1
        heapq.heappush(h,-num)
    else:
        if h:
            x = heapq.heappop(h)
            if x in table and table[x] > 0:
                print(-x)
                table[x]-=1
            else:
                print(x)
        else:
            print(0)
