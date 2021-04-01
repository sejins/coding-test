from collections import deque
n = int(input())

graph = []
dangies = []
dx = [-1,1,0,0]
dy = [0,0,-1,1]

for _ in range(n):
    graph.append(list(map(int,input())))


def bfs(i, j):
    count = 1
    queue = deque()
    graph[i][j] = 0
    queue.append((i,j))

    while queue:
        x,y = queue.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0<=nx<=n-1 and 0<=ny<=n-1:
                if graph[nx][ny] == 1:
                    graph[nx][ny] = 0
                    count+=1
                    queue.append((nx,ny))

    return count



for i in range(n):
    for j in range(n):
        if graph[i][j] == 1:
            cnt = bfs(i,j)
            dangies.append(cnt)


dangies.sort()

print(len(dangies))

for d in dangies:
    print(d)