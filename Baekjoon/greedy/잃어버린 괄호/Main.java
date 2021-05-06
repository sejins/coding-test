import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String exp = scanner.nextLine();


        int idx = exp.indexOf('-');
        int result = 0;

        if(idx==-1){
            String[] numArr = exp.split("\\+");
            for(String num : numArr)
                result+=Integer.parseInt(num);
        }
        else{
            String[] numArr = exp.substring(0,idx).split("\\+");
            for(String num : numArr)
                result+=Integer.parseInt(num);

            while(idx!=-1){
                int nextIdx = exp.indexOf('-',idx+1);
                if(nextIdx!=-1){
                    numArr = exp.substring(idx+1, nextIdx).split("\\+");
                }
                else{
                    numArr = exp.substring(idx+1, exp.length()).split("\\+");
                }
                for(String num : numArr)
                    result-=Integer.parseInt(num);
                idx=nextIdx;
            }
        }

        System.out.println(result);
    }
}