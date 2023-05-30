import java.lang.reflect.Array;
import java.util.Scanner;
public class q39arraysbasic { 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n]; 

        for(int i=0;i<arr.length;i++){ //taking input in arrays.
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){ //printing arrays element
            System.out.print(arr[i]);
        }

    }
}
