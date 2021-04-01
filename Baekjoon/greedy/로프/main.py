n = int(input())
ropes = []
for _ in range(n):
    ropes.append(int(input()))

ropes.sort()

max_ = 0

for i in range(len(ropes)):
    weight = ropes[i]*(len(ropes)-i)
    if weight>max_:
        max_ = weight




print(max_)
