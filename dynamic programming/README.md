# 다이나믹 프로그래밍

참 : 이것이 취업을 위한 코딩테스트다 / 나동빈 저 , [위키백과](https://ko.wikipedia.org/wiki/%EB%8F%99%EC%A0%81_%EA%B3%84%ED%9A%8D%EB%B2%95)

### **다이나믹 프로그래밍**

다이나믹 프로그래밍은 복잡한 문제를 간단한 여러 개의 문제로 나누어 푸는 방법을 말한다.  
분할 정복 알고리즘과도 비슷한데, 다이나믹 프로그래밍은 쉽게 말해서 이전에 계산한 값을 재활용 하는 것을 의미한다.

### **피보나치 수열**

### `a(n) = a(n-1) + a(n-2)`

`a(1)=1 a(2)=1`

이런 경우에 흔히 재귀 함수를 사용해서 문제를 해결할 수 있음.  
하지만 이방식은 n이 커지면 수행시간이 기하급수적으로 늘어난다는 문제점이 존재함!  
시간복잡도가 엄청 늘어난다는 점!!

<img src="https://user-images.githubusercontent.com/71161576/114683865-5939cb80-9d4b-11eb-917e-e5b7f434e987.png" width=500 height=300>

이 처럼 동일한 함수의 호출이 존재한다. (예를 들면 f(3))  
이 말은 이미 계산을 했는데 이를 불필요하게 반복해서 다시 계산을 한다는 의미.  
그래서 이렇게 반복되는 함수의 계산 값을 저장해놨다가, 나중에 다시 계산을 해야하는 상황에 함수를 호출하지 않고 **미리 저장해놓은 계산 값을 사용하는 것**이다.

이것이 다이나믹 프로그래밍의 기본 개념이다.

하지만 다이나믹 프로그래밍을 항상 사용할 수 있는 것은 아니고, 일정 조건을 만족해야 사용 할 수 있다. 그래서 먼저 다이나믹 프로그래밍으로 해결할 수 있는 문제인지 확인하는 것이 필요하다.

1. 큰 문제를 작은 문제로 나눌 수 있을 때
2. 작은 문제에서 구한 정답(계산 값)은 그것을 포함하는 큰 문제에서도 동일한 값으로 사용이 가능 해야함

이렇게 한번 계산한 결과를 메모리 공간에 저장해두고 같은 식을 다시 호출하면 저장한 결과를 그대로 가져오는 기법을 다이나믹 프로그래밍에서 메모이제이션 기법이라고 한다.

그렇다면 다이나믹 프로그래밍을 사용하게 되면, 이미 호출한 함수에 대해서는 반복해서 호출 할 필요가 없어진다.  
<img src="https://user-images.githubusercontent.com/71161576/114685018-728f4780-9d4c-11eb-92ea-12a91a6f8abc.png" width=500 height=300>  
그렇기 때문에 시간 복잡도는 결국 O(n)이 된다. 점선으로 표시 된 부분은 단순히 저장된 값을 불러오기만 하기 때문이다.  
다음 그림을 보면 더 명확하게 이해를 할 수 있을 것이다.

<img src="https://user-images.githubusercontent.com/71161576/114685029-74f1a180-9d4c-11eb-9084-04b68c590039.png" width=500 height=300>

### **다이나믹 프로그래밍의 방식**

크게 이렇게 문제를 작게 쪼개서 해결해나가는 방식은 두가지로 분류 할 수 있다.

- Top-Down 방식
- Bottom-Up 방식

탑다운 방식은 큰 문제를 해결하기 위해서 작은 문제를 호출한다고 해서 붙혀진 이름이다.  
재귀함수를 이용하는 방식이 탑다운 방식이라고 할 수 있다.

바텀업 방식은 작은 문제부터 차근차근 답을 도출한다고 해서 붙혀졌다.  
반복문을 이용해서 작성할 수 있다.

다이나믹 프로그래밍의 전형적인 형태는 바텀업 방식이다.
