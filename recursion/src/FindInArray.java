import java.util.Scanner;

public class FindInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a =sc.nextInt();
        int arr[] =new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(isPresent(arr,a,0));
    }

    private static boolean isPresent(int[] arr, int a, int start) {

        if(arr.length==start){
            return false;

        }
        if(arr[start]==a){
            return true;
        }

        return isPresent(arr,a,start+1);
    }
}
