from collections import deque

n,m = map(int,input().split())

graph = [[] for _ in range(n*m+1)]

nodes = ['0']*(n*m+1)
visited = [False]*(n*m+1)
lengths = [0]*(n*m+1)

for i in range(1,n+1):
    row = list(input())
    for j in range(1,m+1):
        if row[j-1]=='1':
            nodes[m*(i-1)+j]='1'

#print(nodes)

for i in range(1,n*m):
    if nodes[i]=='1':
        if i%m!=0 and nodes[i+1]=='1':  # 조건식 순서 바뀌면 안된다
            graph[i].append(i+1)
            graph[i+1].append(i)
        if i<=(n-1)*m and nodes[i+m]=='1':
            graph[i].append(i+m)
            graph[i+m].append(i)


#print(graph)

for i in range(len(graph)):
    graph[i].sort(reverse=True)

#print(graph)

def bfs(visited,start,graph,lengths):
    queue = deque()
    queue.append((start,1))
    visited[start]=True

    while queue:
        vertex = queue.popleft()
        lengths[vertex[0]] = vertex[1]
        for v in graph[vertex[0]]:
            if not visited[v]:
                visited[v]=True
                queue.append((v,vertex[1]+1))



bfs(visited,1,graph,lengths)

print(lengths[n*m])