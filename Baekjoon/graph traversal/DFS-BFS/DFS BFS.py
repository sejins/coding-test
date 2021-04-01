import sys
from collections import deque
input = sys.stdin.readline

n,m,v = map(int,input().split())

graph=[[] for _ in range(n+1)]

for _ in range(m):
    from_,to_ = map(int,input().split())
    graph[from_].append(to_)
    graph[to_].append(from_)

for i in range(n):
    graph[i].sort()


#print(graph)

visited = [False]*(n+1)

def dfs(visited,start_v,graph):
    
    print(start_v,end=" ")
    visited[start_v] = True

    for v in graph[start_v]:
        if not visited[v]:
            dfs(visited,v,graph)


def bfs(visited, start_v,graph):
    queue = deque()
    visited[start_v]=True
    queue.append(start_v)

    while queue:
        vertex = queue.popleft()
        print(vertex,end=" ")
        for v in graph[vertex]:
            if not visited[v]:
                queue.append(v)
                visited[v]=True





dfs(visited,v,graph)

for i in range(len(visited)):
    visited[i] = False

print()

bfs(visited,v,graph)