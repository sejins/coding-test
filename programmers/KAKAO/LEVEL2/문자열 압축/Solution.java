import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;

        int n=1;
        if(s.length() == 1) return 1;
        // 이런 반례를 문제 풀때 생각하고 고려하는 것이 중요하다!!
        while(n<=s.length()/2){
            int length = s.length();
            int cnt = 1;
            ArrayList<String> strList = new ArrayList<>();
            for(int i=0; i<s.length(); i=i+n){
                if(i+n > s.length()){
                    strList.add(s.substring(i,s.length()));
                }
                else{
                    strList.add(s.substring(i,i+n));
                }
            }
            //System.out.println(strList);
            for(int i=1; i<strList.size(); i++){
                if(strList.get(i).equals(strList.get(i-1))){
                    cnt++;
                    if(i== strList.size()-1 || !strList.get(i).equals(strList.get(i+1))){
                        int cntLen = (cnt+"").length(); // 여기 실수한 부분.... 조심
                        length = length - cnt*n + n+cntLen;
                        cnt = 1;
                    }
                }
            }
            //System.out.println(n);
            //System.out.println(length);
            //System.out.println();
            n++;
            answer = Math.min(answer,length);
        }
        return answer;
    }
}