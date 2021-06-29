import java.util.*;
class Solution {
    public String solution(String p) {
        String answer = "";
        if(isNormal(p)) return p;
        answer = recursive(p);
        return answer;
    }

    private String recursive(String gwals){

        if(gwals.equals(""))    return "";
        
        int open = 0;
        int close = 0;
        String u="";
        String v="";
        for(int i=0; i<gwals.length(); i++){
            if(gwals.charAt(i) == '(')  open++;
            else    close++;
            if(open!=0 && close!=0 && open==close){
                u = gwals.substring(0,i+1);
                v = gwals.substring(i+1, gwals.length());
                break;
            }
        }
        if(isNormal(u)){
            // 1 번 조건
            return u+recursive(v);
        }
        else{
            // 2 번 조건
            u = u.substring(1,u.length()-1);
            String u_ = "";
            if(u.length()!=0){
                for(int i=0; i<u.length(); i++){
                    if(u.charAt(i)=='(')    u_ += ")";
                    else    u_ += "(";
                }
            }
            return "(" + recursive(v) + ")" + u_;
        }
    }

    public boolean isNormal(String p){
        Stack<Character> stack = new Stack<>();
        int close = 0;

        for(int i=0; i< p.length(); i++){
            stack.push(p.charAt(i));
        }
        while(!stack.isEmpty()){
            char temp = stack.pop();
            if(temp == ')') {
                close++;
            }
            else{
                if(close==0) {
                    return false;
                }
                else{
                    close--;
                }
            }
        }
        if(close == 0)  return true;
        else    return false;
    }
}
