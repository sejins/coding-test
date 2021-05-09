# 프린터 큐


우선 내 풀이와 다른 사람의 풀이는 거의 같은 로직으로 수행을 한다.  

코드를 작성하는 방법에서 눈여겨보고 넘어가야할 것들이 있었음!

```java
 int T = in.nextInt();	// 테스트 케이스 

while(T-- > 0){
    ...
        }
```  

이러한 표현에 익숙해지면 좋을 것 같음! -> for 문을 사용해야 하는것을 간결하게 표현이 가능.  

--------------------

그리고 문제를 푸는데 있어서 지장은 없지만 , 나처럼 풀이하면 테스트 케이스별로 나온 결과들을 
반복문이 끝날때마다 출력을 함. -> 이것도 정잡처리가 되긴 하지만..  

더 정확한 답안을 위해서는 `StringBuffer`를 통해서 문자열을 만든 다음에 한번에 출력하는 방식을 사용하자

```java
int T = in.nextInt();	// 테스트 케이스 
StringBuffer sb = new StringBuffer();
        
while(T-- > 0){
    ...
    sb.append("anything" + "\n");    
        }

System.out.println(sb);
```  

-------------  

그리고 자바로 Queue 기능을 사용하려면 Queue 인터페이스를 구현한 클래스 아무거나 사용하면된다.  

```java
Object element()
boolean offer(Object o)
Object peek()
object pool()
Object remove()
```  
이것들은 모두 Queue 인터페이스를 구현하면서 오버라이딩한 메서드들이기 때문에, 이를 사용하면 된다.  

추가로 Deque 인터페이스의 메서드들도 오버라이딩하고 있기 때문에, Deque 인터페이스를 구현한 클래스들은 그것들도 사용하면 된다.  
