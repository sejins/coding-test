n = int(input())
s = [0]*301

for i in range(1,n+1):
    s[i] = int(input())




dp = [[0]*2 for _ in range(301)]



dp[1][0],dp[1][1] = s[1],s[1]
dp[2][0],dp[2][1] = s[1]+s[2],s[2]



for i in range(3,n+1):
    dp[i][0] = dp[i-1][1] + s[i]
    dp[i][1] = max(dp[i-2]) + s[i]

print(max(dp[n]))