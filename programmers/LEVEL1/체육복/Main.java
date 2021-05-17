class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int count = 0;

        boolean[] real_lost = new boolean[n+1];
        boolean[] real_resv = new boolean[n+1];

        for(int i : lost){
            real_lost[i]=true;
        }
        for(int i : reserve){
            real_lost[i]=false;
        }

        for(int i : reserve){
            real_resv[i]=true;
        }
        for(int i : lost){
            real_resv[i]=false;
        }

        for(int i=0; i<real_lost.length; i++){
            if(real_lost[i]){

                if(i!=n && real_resv[i+1]){
                    real_resv[i+1]=false;
                    continue;
                }

                if(i!=1 && real_resv[i-1]){
                    real_resv[i-1]=false;
                    continue;
                }
                count++;
            }
        }

        return n-count;
    }
}