import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        for(int l=0; l<k; l++){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            Integer[] max = new Integer[n];
            int count = 0;

            LinkedList<int[]> list = new LinkedList<>();

            for(int i=0; i<n; i++){
                int temp = scanner.nextInt();
                int[] tmp = new int[2];
                if(i == m){
                    tmp[1]=1;
                }
                tmp[0]=temp;
                list.add(tmp);
                max[i] = temp;
            }

            Arrays.sort(max,Collections.reverseOrder());
            int i=0;

            while(true){
                int[] t = (int[])list.remove();
                if(max[i]==t[0]){
                    count++;
                    i++;
                    if(t[1]==1){
                        break;
                    }
                }
                else{
                    list.add(t);
                }
            }

            System.out.println(count);
        }
    }
}