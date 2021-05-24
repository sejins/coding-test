class Solution {
    public String solution(int a, int b) {
        String answer = "";

        int[] days = {0,31,29,31,30,31,30,31,31,30,31,30,31};

        String[] week = {"THU","FRI","SAT","SUN","MON","TUE","WED"};

        int period = 0;

        for(int i=0; i<a; i++){
            period+=days[i];
        }
        period+=b;

        answer = week[period % 7];

        return answer;
    }
}