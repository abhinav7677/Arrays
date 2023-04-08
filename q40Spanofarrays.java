import java.util.Scanner;
public class q40Spanofarrays {
    public static void main(String[] args){ //span means the diff of highest and lowest element
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            //for max
            if(arr[i]>max){
                max=arr[i];
            }
            //For min
            if(arr[i]<min){
                min=arr[i];
            }
            
        }

        int span=max-min;
        System.out.println(span);
        
    }
    
}

/*//Span code //not optimized
        // for max
        int max=arr[0];
        for(int i=0;i<arr.length;i++){ 
            
            if(arr[i]>arr[1]){
                max=arr[i];
            }
            else{
                max=arr[0];
            }

        }

        //Span Code
        //for min
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]<arr[1]){
                min=arr[i];
            }
            else{
                min=arr[0];
            }
        }

        //now result
        int span=max-min;
        System.out.println(span); */
