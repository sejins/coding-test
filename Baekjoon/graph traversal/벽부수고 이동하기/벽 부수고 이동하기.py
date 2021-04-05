from collections import deque

n,m = map(int,input().split())

dx,dy = [-1,1,0,0],[0,0,-1,1]

graph = [list(map(int,input())) for _ in range(n)]

queue = deque()

def solution():

    visited = [[[0]*2 for _ in range(m)] for _ in range(n)]
    visited[0][0][0] = 1
    queue.append((0,0,0))

    while queue:
        x,y,wall = queue.popleft()

        if x==n-1 and y==m-1:
            return visited[x][y][wall]

        for i in range(4):
            nx, ny = x+dx[i], y+dy[i]

            if 0<=nx<=n-1 and 0<=ny<=m-1 and visited[nx][ny][wall]==0:
                if graph[nx][ny]==0:
                    visited[nx][ny][wall] = visited[x][y][wall] + 1
                    #print(nx,ny,wall)
                    queue.append((nx,ny,wall))
                if wall==0 and graph[nx][ny]==1:
                    visited[nx][ny][1] = visited[x][y][0] + 1
                    #print(nx,ny,1)
                    queue.append((nx,ny,1))

    return -1


print(solution())
