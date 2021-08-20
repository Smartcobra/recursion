import java.util.Scanner;

public class FindPower {

    public static int getPower(int x, int n){
        if(x==0){
            return 0;
        }
        if(x==1 ||n==0){
            return 1;
        }
       if(n==1){
           return x;
       }
       int smallAns=getPower(x,n-1);
       return x*smallAns;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(getPower(x,n));
    }
}
