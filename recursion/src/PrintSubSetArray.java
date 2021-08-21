import java.util.Scanner;

public class PrintSubSetArray {

    private static void printSubSetArrayHelper(int[] arr, int startIndex, int[] opArr) {
        //base case
        if(arr.length==startIndex){
         /*   for(int i=0;i<opArr.length;i++){// we can write the below code also
                System.out.print(opArr[i]);
            }*/
            for(int i:opArr){
                System.out.print(i);
            }
            System.out.println();
            return;
        }

        //form the new array
        int k=0;
        int newArr[] = new int[opArr.length+1];
        for (int i=0;i<opArr.length;i++){
            newArr[i]=opArr[i];
            k++;
        }
        newArr[k]=arr[startIndex];
        printSubSetArrayHelper(arr,startIndex+1,opArr);
        printSubSetArrayHelper(arr,startIndex+1,newArr);

    }



    public static void printSubSetArray(int arr[]){
        int opArr[]= new int [0];
        printSubSetArrayHelper(arr,0,opArr);

    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int input[]=new int[size];
        for(int i=0;i<size;i++){
            input[i]=sc.nextInt();
        }
        printSubSetArray(input);
    }
}
