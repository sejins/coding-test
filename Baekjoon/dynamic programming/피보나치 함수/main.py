t = int(input())

def fibo(n):
    dp = [0]*41

    dp[0] = (1,0)
    dp[1] = (0,1)

    if n>=2:
        for i in range(2, n + 1):
            x1,y1 = dp[i-1]
            x2,y2 = dp[i-2]
            dp[i] = (x1+x2,y1+y2)

    return dp[n]

for _ in range(t):
    num = int(input())
    x,y = fibo(num)
    print(x,y)