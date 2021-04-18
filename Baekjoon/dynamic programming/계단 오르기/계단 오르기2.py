import sys
input = sys.stdin.readline

N = int(input())
dp = [0 for _ in range(N+3)]
s = [0 for _ in range(N+3)]
for k in range(1,N+1):
    s[k] = int(input())


dp [1] = s[1]
dp [2] = s[1] + s[2]
dp [3] = max(s[1] + s[3] ,s[2] + s[3])


for i in range(4, N+1):
    dp[i] = max( dp[i-3] + s[i-1] + s[i] ,  dp[i-2] + s[i] ) 
print(dp[N])