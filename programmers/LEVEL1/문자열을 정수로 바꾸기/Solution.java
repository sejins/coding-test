class Solution {
    public int solution(String s) {
        int answer = 0;

        char sign = s.charAt(0);

        if(sign == '+' || sign == '-'){
            s = s.substring(1,s.length());
            answer = Integer.parseInt(s);
            if(sign == '-'){
                answer = -answer;
            }
        }
        else{
            answer = Integer.parseInt(s);
        }

        return answer;
    }
}