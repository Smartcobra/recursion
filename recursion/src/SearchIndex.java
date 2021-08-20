import java.util.Scanner;

public class SearchIndex {

    private static int getIndex(int[] arr, int start,int a) {
        if(start==arr.length){
            return -1;
        }
        if(arr[start]==a){
            return start;
        }
        return getIndex(arr,start+1,a);
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a= sc.nextInt();
        int arr[] =new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(getIndex(arr,0,a));
    }


}
