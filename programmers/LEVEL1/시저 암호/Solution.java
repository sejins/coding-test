class Solution {
    public String solution(String s, int n) {
        StringBuffer answer = new StringBuffer();

        for(int i=0; i<s.length(); i++){
            char temp = s.charAt(i);
            if(temp>='a' && temp <= 'z'){
                answer.append((char)(((temp-'a'+n)%26)+'a'));
            }
            else if(temp>='A' && temp<='Z'){
                answer.append((char)(((temp-'A'+n)%26)+'A'));
            }
            else{
                answer.append(' ');
            }
        }
        return answer.toString();
    }
}