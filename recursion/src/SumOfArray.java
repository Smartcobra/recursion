import java.util.Scanner;



public class SumOfArray {

    public static int getSum(int arr[],int length){
        if(length<=0){
            return 0;
        }
      return arr[length-1]+getSum(arr,length-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] =new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(getSum(arr,arr.length));
    }
}
