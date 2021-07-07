import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        int n = numbers.length;

        String[] strArr = new String[n];

        for(int i=0; i<n; i++){
            strArr[i] = numbers[i]+"";
        }

        Arrays.sort(strArr, new Comparator<String>(){
            public int compare(String s1, String s2){
                String temp1 = s1+s2;
                String temp2 = s2+s1;
                return -temp1.compareTo(temp2);
            }
        });

        if(strArr[0].equals("0"))   return "0";

        for(String s : strArr){
            answer+=s;
        }
        return answer;
    }
}