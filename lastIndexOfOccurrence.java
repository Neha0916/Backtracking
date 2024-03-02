import java.util.Scanner;
public class lastIndexOfOccurrence {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" element");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value to find its first occurrence");
        int val=sc.nextInt();
        System.out.println(firstIndx(arr,val,n));
    }
    public static int firstIndx(int arr[],int val,int n){
        if(n==0) return -1;
        if(arr[n-1]==val){
            return n-1;
        }
        else {
            int ind=firstIndx(arr,val,n-1);
            return ind;
        }
    }
}
