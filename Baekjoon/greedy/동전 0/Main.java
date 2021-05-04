import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = 0;
        int[] coins = new int[n];

        for(int i=n-1; i>=0; i--){
            coins[i] = scanner.nextInt();
        }


        for(int coin : coins){
            if(coin<=k){
                result+=(k/coin);
                k%=coin;
            }
        }

        System.out.println(result);
    }
}
