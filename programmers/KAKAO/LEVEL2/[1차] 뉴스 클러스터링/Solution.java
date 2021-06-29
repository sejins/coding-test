import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int union = 0;
        int intersect = 0;
        double jakad = 0.0;
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();

        // 원래 문자열 compareTo 써서 비교하려고 했는데.
        // A~Z  ...  a~z 사이에 특수문자 있어서 사용 못했음!!
        // 이거 기억해놓기~!
        for(int i=0; i<str1.length()-1; i++){
            String temp = str1.substring(i,i+2);
            char first = temp.charAt(0);
            char second = temp.charAt(1);
            if((first>='A' && first <='Z' || first>='a' && first<='z') && (second>='A' && second <='Z' || second>='a' && second<='z')){
                A.add(temp);
            }
        }
        for(int i=0; i<str2.length()-1; i++){
            String temp = str2.substring(i,i+2);
            char first = temp.charAt(0);
            char second = temp.charAt(1);
            if((first>='A' && first <='Z' || first>='a' && first<='z') && (second>='A' && second <='Z' || second>='a' && second<='z')){
                B.add(temp);
            }
        }

        for(String strA : A){ // 최대 2000*2000번
            String equal = "";
            for(String strB : B){
                if(strA.equalsIgnoreCase(strB)){
                    intersect++;
                    equal = strB;
                    break;
                }
            }
            B.remove(equal);
        }

        union = A.size() + B.size();


        if(union==0 && intersect==0){
            return 65536;
        }
        jakad = (double)intersect / union * 65536;
        answer = (int)jakad;

        return answer;
    }
}