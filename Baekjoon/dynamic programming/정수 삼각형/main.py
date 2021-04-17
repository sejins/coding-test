import sys
n = int(input())

tree = []
tree.append([])
dp = [[] for _ in range(501)]

for _ in range(n):
    lst = list(map(int, sys.stdin.readline().rstrip().split()))
    tree.append(lst)

dp[1].append(tree[1][0])
#print(tree)
#print(dp)

for i in range(2,n+1):
    for j in range(i):
        if j==0:
            dp[i].append(dp[i-1][j] + tree[i][j])
        elif j!=0 and j!=i-1:
            dp[i].append(max(dp[i-1][j-1], dp[i-1][j]) + tree[i][j])
        else:
            dp[i].append(dp[i-1][j-1] + tree[i][j])

#print(dp[n])
print(max(dp[n]))


