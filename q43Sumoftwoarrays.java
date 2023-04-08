import java.util.Scanner;

public class q43Sumoftwoarrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int arr1[]=new int[n1];

        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }

        int n2=sc.nextInt();
        int arr2[]=new int[n1];

        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }

        int sum[]=new int[n1>n2?n1:n2];

        int c=0;
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=sum.length-1;

        while(k>=0){
            int d=c;

            if(i>=0){
                d=d+arr1[i];
            }
            if(j>=0){
                d=d+arr2[j];
            }
            c=d/10;
            d=d%10;
            sum[k]=d;

            i--;
            j--;
            k--;

        }

        
        if(c!=0){
            System.out.print(c);
        }
        for(int val:sum){
            System.out.print(val);
        }

        }
    }

