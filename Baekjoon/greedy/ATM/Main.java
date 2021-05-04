import java.util.Arrays;
import java.util.Scanner;


class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int prev = 0;
        int result = 0;

        for(int i=0; i<n; i++){
            prev += arr[i];
            result+=prev;
        }
        System.out.println(result);
    }
}
