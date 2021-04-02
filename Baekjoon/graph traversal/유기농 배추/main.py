from collections import deque
t = int(input())

results = []

dx = [-1,1,0,0]
dy = [0,0,-1,1]


for _ in range(t):
    m,n,k = map(int,input().split())

    graph = [[0]*m for _ in range(n)]
    baechooes = []
    count = 0

    for _ in range(k):
        x,y = map(int,input().split())
        graph[y][x] = 1
        baechooes.append((y,x))

    for b in baechooes:
        if graph[b[0]][b[1]]==1: # baechooes 리스트를 돌면서 해당 위치 부터 탐색을 시작한다  -> 돌면서 graph 리스트를 변경하면서 탐색 결과를 바로바로 반영한다.
            count += 1
            queue = deque()
            queue.append((b[0],b[1]))
            graph[b[0]][b[1]]=0
            while queue:
                x,y = queue.popleft()
                for i in range(4):
                    nx = x + dx[i]
                    ny = y + dy[i]
                    if 0<=nx<=n-1 and 0<=ny<=m-1:
                        if graph[nx][ny] == 1:
                            queue.append((nx,ny))
                            graph[nx][ny]=0

    #print(count)
    results.append(count)

for result in results:
    print(result)