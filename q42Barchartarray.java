import java.util.Scanner;
public class q42Barchartarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];


        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[0]){
                max=arr[i];
            }
        }

       // System.out.println(max); checking max element code working correctly or not
       for(int topfloor=max;topfloor>=1;topfloor--){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=topfloor){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
       }
    }
}
