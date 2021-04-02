from collections import deque

n,k = map(int,input().split())

visited = [False]*100001  # 0 ~ 100000


def bfs(start, visited, destination):

    queue = deque()
    count = 0
    queue.append((start, count)) # 노드의 번호와 거리를 함께 큐에 저장한다.
    visited[start] = True

    while queue:
        v, cnt = queue.popleft()
        #print(v,cnt)

        if v == destination:
            return cnt

        if 0 <= v-1 <= 100000:
            if not visited[v-1]:
                visited[v-1] = True
                queue.append((v-1, cnt+1))
        if 0 <= v+1 <= 100000:
            if not visited[v+1]:
                visited[v+1] = True
                queue.append((v+1, cnt+1))
        if 0 <= 2*v <= 100000:
            if not visited[2*v]:
                visited[2*v] = True
                queue.append((2*v, cnt+1))


result = bfs(n, visited, k)

print(result)