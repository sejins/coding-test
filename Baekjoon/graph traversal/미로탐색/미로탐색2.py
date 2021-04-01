from collections import deque
n,m = map(int,input().split())

graph = []

# 상하좌우로 이동하기 위해서 사용하는 이동정보
dx = [-1,1,0,0]
dy = [0,0,-1,1]

for i in range(n):
    graph.append(list(map(int,input())))

def bfs(x,y):
    queue = deque()
    cnt = 1
    queue.append((x,y,cnt))

    while queue:
        x,y,cnt = queue.popleft()

        if x==n-1 and y== m-1:
            return cnt

        for i in range(4):
            nx = x+dx[i]
            ny = y+dy[i]
            if 0<=nx<=n-1 and 0<=ny<=m-1:
                if graph[nx][ny]==0:
                    continue
                elif graph[nx][ny]==1:
                    queue.append((nx,ny,cnt+1))
                    graph[nx][ny]=0

print(bfs(0,0))