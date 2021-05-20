import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public String solution(String new_id) {
        String answer = "";

        StringBuffer id = new StringBuffer(new_id);
        id = method1(id);
        //System.out.printf("method1 : %s%n",id);
        id = method2(id);
        //System.out.printf("method2 : %s%n",id);
        id = method3(id);
        //System.out.printf("method3 : %s%n",id);
        id = method4(id);
        //System.out.printf("method4 : %s%n",id);
        id = method5(id);
        //System.out.printf("method5 : %s%n",id);
        id = method6(id);
        //System.out.printf("method6 : %s%n",id);
        id = method7(id);

        answer = id.toString();
        return answer;
    }

    private StringBuffer method1(StringBuffer id) {
        String temp = id.toString();
        return new StringBuffer(temp.toLowerCase());
    }
    private StringBuffer method2(StringBuffer id) {
        StringBuffer new_sb = new StringBuffer("");
        String pattern = "^[a-z0-9-_.]*$";
        Pattern p = Pattern.compile(pattern);
        Matcher m;
        for(int i=0; i<id.length(); i++){
            String temp = id.substring(i,i+1);
            m = p.matcher(temp);
            if(m.matches()){
                new_sb.append(temp);
            }
        }
        return new_sb;
    }
    private StringBuffer method3(StringBuffer id) {
        String temp = id.toString();
        String[] strs = temp.split("\\.+");
        StringBuffer new_sb = new StringBuffer(String.join(".",strs));
        if(new_sb.length()==0)  new_sb.append(".");
        return new_sb;
    }
    private StringBuffer method4(StringBuffer id) {

        if(id.charAt(0)=='.')   id.deleteCharAt(0);
        if(id.length()!=0){
            int lastIdx = id.length()-1;
            if(id.charAt(lastIdx)=='.')   id.deleteCharAt(lastIdx);
        }
        return id;
    }
    private StringBuffer method5(StringBuffer id) {
        if(id.toString().equals(""))    return new StringBuffer("a");
        return id;
    }
    private StringBuffer method6(StringBuffer id) {
        if(id.length()>=16){
            id.delete(15,id.length());
        }
        return method4(id); // 만약 마지막 문자가 '.'인 경우에는 삭제
    }
    private StringBuffer method7(StringBuffer id) {
        if(id.length()==1){
            id.append(id.charAt(id.length()-1));
            id.append(id.charAt(id.length()-1));
        }
        if(id.length()==2)  id.append(id.charAt(id.length()-1));

        return id;
    }
}