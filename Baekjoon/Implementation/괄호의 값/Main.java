import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] gwals = s.nextLine().split("");
        Stack st = new Stack();
        boolean errorFlag=false;
        int result = 0;
        int tResult = 0;

        for(int i=0; i<gwals.length; i++){
            String g = gwals[i];

            if(g.equals("(") || g.equals("[")){
                st.push(g);
            }

            if(g.equals(")")){
                //System.out.println("hello");
                int tSum = 0;
                while(!st.empty()){
                    String tmp = (String)st.pop();
                    if(tmp.equals("(")){
                        if(tSum==0){
                            st.push("2");
                        }
                        else{
                            st.push((tSum*2)+"");
                        }
                        break;
                    }
                    if(tmp.equals("[") || tmp.equals("]") || tmp.equals(")")){
                        errorFlag=true;
                        break;
                    }
                    else{
                        tSum+=Integer.parseInt(tmp);
                    }
                }
                //System.out.println(st);
            }
            if(g.equals("]")){
                int tSum = 0;
                while(!st.empty()){
                    String tmp = (String)st.pop();
                    if(tmp.equals("[")){
                        if(tSum==0){
                            st.push("3");
                        }
                        else{
                            st.push((tSum*3)+"");
                        }
                        break;
                    }
                    if(tmp.equals("(") || tmp.equals(")") || tmp.equals("]")){
                        errorFlag=true;
                        break;
                    }
                    else{
                        tSum+=Integer.parseInt(tmp);
                    }
                }
                //System.out.println(st);
            }
            if(errorFlag){
                break;
            }
        }
        while(!st.empty()){
            String num = (String)st.pop();
            if(num.equals("[") || num.equals("]") || num.equals("(") || num.equals(")")){
                errorFlag = true;
                break;
            }
            else{
                tResult+=Integer.parseInt(num);
            }
        }

        if(!errorFlag)
            result = tResult;

        System.out.println(result);
    }
}