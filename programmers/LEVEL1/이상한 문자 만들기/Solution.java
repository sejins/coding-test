class Solution {
    public String solution(String s) {
        // 문제를 못읽은 것도 있지만, 조금 불친절한 문제인듯.
        String answer = "";
        StringBuffer sb = new StringBuffer();

        int idx = -1;
        for(int i=0; i<s.length(); i++){
            String temp = s.charAt(i)+"";
            if(temp.equals(" ")){
                idx=-1;
                sb.append(temp);
            }
            else{
                if((++idx)%2==0){
                    sb.append(temp.toUpperCase());
                }
                else{
                    sb.append(temp.toLowerCase());
                }
            }
        }
        answer = sb.toString();
        return answer;
    }
}