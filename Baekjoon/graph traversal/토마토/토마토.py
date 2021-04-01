from collections import deque

m, n = map(int, input().split())

graph = []

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

for i in range(n):
    graph.append(list(map(int, input().split())))

cooked = []
tomatos_not_cooked = 0
# 1(익은 토마토)들에 대한 정보 저장
# 0의 개수(안익은 토마토) 저장
for i in range(n):
    for j in range(m):
        if graph[i][j] == 1:
            cooked.append((i, j))
        elif graph[i][j] == 0:
            tomatos_not_cooked += 1


def bfs():
    queue = deque()
    count = 0  # 탐색한 토마토의 개수
    days = 0
    for c in cooked:
        x, y = c[0], c[1]
        queue.append((x, y, days))
    
    while queue:
        x, y, d = queue.popleft()
        if d > days:
            days = d
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx <= n - 1 and 0 <= ny <= m - 1:
                if graph[nx][ny] == 0:
                    graph[nx][ny] = 1
                    queue.append((nx, ny, d + 1))
                    count += 1
                    
    if count == tomatos_not_cooked:
        return days
    else:
        return -1


print(bfs())


