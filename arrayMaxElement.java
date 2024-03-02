import java.util.Scanner;

public class arrayMaxElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" element");
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum element of given array is: "+maxElement(arr,n));
    }
//    static int max=-1;
    public static int maxElement(int arr[],int n){
//        if(n==0) return max;
//        if(arr[n-1]>max)
//            max=arr[n-1];
//        return maxElement(arr,n-1);

        if(n==0) return 0;
        int max=maxElement(arr,n-1);
        if(max>arr[n-1])
            return max;
        else
            return arr[n-1];
    }
}
