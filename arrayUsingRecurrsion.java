import java.util.Scanner;
public class arrayUsingRecurrsion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms to be inserted");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" element");
            arr[i]=sc.nextInt();
        }
        print(n,arr);
    }
    public static void print(int n,int arr[]){
        if(n==0) return;
//        correct order

//        print(n-1,arr);
//        System.out.print(arr[n-1]+" ");


//        reverse order

        System.out.print(arr[n-1]+" ");
        print(n-1,arr);

    }
}
