
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] timeTable = new int[n][2];

        for(int i=0; i<n; i++){
            timeTable[i][0] = scanner.nextInt();
            timeTable[i][1] = scanner.nextInt();
        }

        Arrays.sort(timeTable, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o2[1]==o1[1]){
                    return o1[0] - o2[0];
                }
                else{
                    return o1[1] - o2[1];
                }
            }
        });

        int count = 0;
        int temp = 0;

        for(int i=0; i<n; i++){
            if(temp<=timeTable[i][0]){
                temp=timeTable[i][1];
                count++;
            }
        }

        System.out.println(count);

    }
}