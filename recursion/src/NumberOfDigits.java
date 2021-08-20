import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(getNoDigits(n));
    }

    private static int getNoDigits(int n) {

        if (n==0){
            return 0;
        }
        int smallAns=getNoDigits(n/10);
        int ans=smallAns+1;

        return ans;
    }
}
