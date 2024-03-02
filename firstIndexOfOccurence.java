import java.util.Scanner;
public class firstIndexOfOccurence {
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
        System.out.println(firstIndx(arr,val,0));
    }
    public static int firstIndx(int arr[],int val,int n){
        if(n==arr.length) return -1;
        if(arr[n]==val){
            return n;
        }
        else {
            int ind=firstIndx(arr,val,n+1);
            return ind;
        }
    }
}
//1 2 3 4 5