import java.util.Stack;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        int strIdx = 0;
        int endIdx = 0;
        int temp = 0;
        for(int i=0; i<dartResult.length(); i++){
            char ch = dartResult.charAt(i);

            if(ch == 'S' || ch == 'D' || ch == 'T'){
                endIdx = i;
                temp = Integer.parseInt(dartResult.substring(strIdx,endIdx));

                if(ch == 'D'){
                    temp = temp*temp;
                }

                else if (ch == 'T') {
                    temp = temp*temp*temp;
                }

                if(i!=dartResult.length()-1 && (dartResult.charAt(i+1)=='*' || dartResult.charAt(i+1)=='#')){ // 이거 정리하기 조건식!!
                    strIdx = i+2;
                }

                if(i==dartResult.length()-1 || dartResult.charAt(i+1)!='*' && dartResult.charAt(i+1)!='#'){
                    st.push(temp);
                    strIdx = i+1;
                }
            }

            else if(ch == '*'){
                if(!st.empty()){
                    int tmp = st.pop();
                    st.push(2*tmp);
                }
                st.push(2*temp);

            }

            else if(ch == '#'){
                st.push(-temp);
            }

        }

        while(!st.empty()){
            answer+=st.pop();
        }

        return answer;
    }
}