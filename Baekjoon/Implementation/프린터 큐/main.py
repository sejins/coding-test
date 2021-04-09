from collections import deque

t = int(input())

for _ in range(t):
    n, m = map(int, input().split())
    count = 0

    priority = list(map(int,input().split()))
    queue = deque()
    for i in range(len(priority)):
        queue.append((priority[i],i))
    priority.sort(reverse=True)
    max_index = 0


    while True:
        x,index = queue.popleft()

        if x == priority[max_index]:
            count += 1
            max_index += 1
            if index == m:
                print(count)
                break

        else:
            queue.append((x,index))
