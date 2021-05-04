import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int result = 0;

        while(true){
            if(n%5==0){
                result += (n/5);
                break;
            }
            n-=3;
            result++;
            if(n==1 || n==2){
                result = -1;
                break;
            }
        }

        System.out.println(result);
    }
}
