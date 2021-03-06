# [계단 오르기](https://www.acmicpc.net/problem/2579)

* 2차원 리스트 만들때는, 리스트 컴프리헨션 사용하세요~


이 문제의 포인트는  
`계단은 한번에 한계단 또는 두계단씩 오를 수 있다`는 것  
`연속해서 3개의 계단을 밟을 수 없다`는 것
`마지막 계단을 반드시 밟아야한다`는 것  

**내 풀이**  

즉 임의의 i 에 대해서 현재 계단으로 올 수 있는 계단은 `i-1` 또는 `i-2`
하지만 연속해서 3개의 계단을 밟을 수 없다는 조건 때문에, 나는 dp 테이블에 두가지의 값을 저장함.  
1. `i-1` 번째 계단에서 현재로 오는 누적합
2. `i-2` 번째 계단에서 현재로 오는 누적합
* 연속한 3개의 계단을 밟지 못하기 때문에 `i-1`번째 계단에서 현재로 오는 누적합은 `dp[i-1]`에 저장된 두개의 값 중 `i-2` 번째 계단에서 온 경우에 현재 계단의 점수 `s[i]` 를 더한 값
* `i-2` 번째 계단에서 오는 경우는 어떻게 해도 연속 3개의 계단을 밟지 않으니까 `dp[i-1]` 에 저장된 값 중 더 큰 값을 선택하고, 현재 계단의 점수 `s[i]`을 더하는 방식으로 진행.  

결국 `dp[n]` 에는 `n-1` 계단에서 온 최대 누적 점수와, `n-2` 계단에서 온 최대 누적 점수가 저장돼 있을 것이고, 그 둘 중 최대 값을 선택하면 된다.
 
결국 내 풀이를 더 깔끔하고 직관적인 점화식으로 나타 낼 수 있었음.  
이렇게 하면 dp 테이블에 두개의 값을 저장할 필요도 없음.
원래의 생각은 최대값을 골라서 dp 테이블에 저장한다고 해도, 이게 만약 연속 3번 밟는 조건에 걸릴경우, 다른 경우를 생각해야한다고 했던 것인데, 
이미 점화식을 구하는 과정에서 3번 밟는 경우를 피해서 식을 만들었기 때문에 굳이 두개의 값을 저장하지 않고 둘 중 최대의 값 하나만 저장하면 됐었다.

**다른 답안**  

결국 간단하게 나타내면,
`i-2`에서 오는 경우 : `dp[i-2] + s[i]`
`i-1`에서 오는 경우 : `dp[i-3] + s[i-1] + s[i]`  
중에서 더 큰 값을 `dp[i]` 에 저장하면 됐었다. 
