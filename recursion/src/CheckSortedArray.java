import java.util.Scanner;

public class CheckSortedArray {
    public static boolean isSorted(int arr[]){
        if(arr.length==1){
            return true;
        }

        int smallInput[]= new int[arr.length-1];
            for(int i=1;i<arr.length;i++){
                smallInput[i-1]=arr[i];
            }
          boolean ans=isSorted(smallInput);
          if(!ans){
              return false;
          }
        if(arr[0]<=arr[1]){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println(isSorted(arr));
    }
}
