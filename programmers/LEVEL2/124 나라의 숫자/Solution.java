class Solution {
    public String solution(int n) {
        String answer = "";
        String[] numArr = new String[]{"4","1","2"};

        while(n>0){
            int temp = n % 3;
            answer = numArr[temp]+answer; // 문자열의 앞부분에 추가해줘야한다.
            n/=3;
            if(temp == 0){
                n-=1;
            }
        }

        return answer;
    }
}