class Solution {
    public String solution(String s) {
        String answer = "";

        if(s.length()%2!=0){
            int idx = (int)(s.length()/2);
            answer = s.substring(idx,idx+1);
        }
        else{
            int idx = (int)((s.length()-1)/2);
            answer = s.substring(idx,idx+2);
        }

        return answer;
    }
}