import java.util.Scanner;

public class FibonacciNumber {


    public static int getFib(int n){
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        return getFib(n-1)+getFib(n-2);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(getFib(n));
    }

}
