import sys

n = int(input())

houses = [[0]*3 for _ in range(n+1)]
dp = [[0]*3 for _ in range(n+1)]

for i in range(1,n+1):
    houses[i][0], houses[i][1], houses[i][2] = map(int, sys.stdin.readline().rstrip().split())

dp[1][0], dp[1][1], dp[1][2] = houses[1][0], houses[1][1], houses[1][2]
#   빨       초       파

for i in range(2,n+1):
    dp[i][0] = min(dp[i-1][2],dp[i-1][1]) + houses[i][0]
    dp[i][1] = min(dp[i-1][0],dp[i-1][2]) + houses[i][1]
    dp[i][2] = min(dp[i-1][0],dp[i-1][1]) + houses[i][2]

print(min(dp[n]))
