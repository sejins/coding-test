from collections import deque

num = int(input())
graph = [[] for _ in range(num+1)]
visited = [False]*(num+1)

n = int(input())

# 숫자 그래프 생성
for _ in range(n):
    from_, to_ = map(int,input().split())
    graph[from_].append(to_)
    graph[to_].append(from_)

# 무조건 시작은 1번 노드
def bfs(graph,visited):
    queue = deque()
    queue.append(1)
    count=0
    visited[1]=True

    while queue:
        node = queue.popleft()
        for n in graph[node]:
            if not visited[n]:
                queue.append(n)
                count+=1
                visited[n]=True
    return count

print(bfs(graph,visited))
