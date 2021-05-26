class Solution {
    public String solution(String[] seoul) {
        int idx = 0;
        String answer = "";
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                idx=i;
            }
        }
        answer = String.format("김서방은 %d에 있다", idx);
        return answer;
    }
}