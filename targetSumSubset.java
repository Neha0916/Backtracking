import java.util.Scanner;

public class targetSumSubset {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" element");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target sum value");
        int targetSum=sc.nextInt();
        tSS(arr,0,0,targetSum,"");
    }
    public static void tSS(int arr[],int n,int sum,int targetSum,String s){

        if(n==arr.length){
            if(sum==targetSum){
                System.out.println(s);
            }
            return;
        }
        tSS(arr,n+1,sum+arr[n],targetSum,s+" "+arr[n]);
        tSS(arr,n+1,sum,targetSum,s);
    }
}
