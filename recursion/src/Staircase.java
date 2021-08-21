import java.util.Scanner;

public class Staircase {

    public static int stairCase(int n){
        if(n<0){
            return 0;
        }if(n==0){
            return 1;
        }else{
            return stairCase(n-1)+stairCase(n-2)+stairCase(n-3);
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
    }

}
