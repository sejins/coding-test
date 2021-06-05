class Solution {
    public String solution(int n) {
        String answer = "";

        String[] strArr = new String[]{"4","1","2"};

        while(n > 0){
            int r = n%3;
            n /= 3;

            if(r==0){
                n--;
            }

            answer = strArr[r] + answer; // 문자열의 앞에 추가를 해야한다.
        }

        return answer;
    }
}