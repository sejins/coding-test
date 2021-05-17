class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i<nums.length-2; i++){ //50
            for(int j=i+1; j<nums.length-1;j++){ //50
                for(int k=j+1; k<nums.length;k++){ //50
                    int num = nums[i]+nums[j]+nums[k];
                    boolean so=false;
                    for(int n=2; n<num; n++){
                        if(num%n==0){
                            so=true;
                            break;
                        }
                    }
                    if(!so){
                        answer++;
                        System.out.println(num);
                    }
                }
            }
        }

        return answer;
    }
}