import sys
import heapq

numbers = int(input()) # 테스트 횟수
heap = []              # 힙 선언

for _ in range(numbers):
    num = int(sys.stdin.readline())
    if num != 0:
        heapq.heappush(heap, (abs(num), num)) 
    else:
        try:
            print(heapq.heappop(heap)[1])
        except:
            print(0)