class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        int[][] result = new int[n][n];

        for(int i=0; i<n;i++){
            int k = n;
            System.out.println(i);
            while(k-- > 0){
                int temp1 = arr1[i]%2;
                int temp2 = arr2[i]%2;
                arr1[i]/=2;
                arr2[i]/=2;
                result[i][k] = temp1 | temp2;
            }
        }

        int i=0;
        for(int[] arr : result){
            StringBuffer sb = new StringBuffer();
            for(int a : arr){
                if(a==1){
                    sb.append("#");
                }
                else{
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
            i++;
        }

        return answer;
    }
}