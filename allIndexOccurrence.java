import java.util.Scanner;
public class allIndexOccurrence {
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
            int res[]=allIndx(arr,val,0,0);
            if(res.length==0){
                System.out.println();
            }
            else{
                for(int i=0;i<res.length;i++){
                    System.out.print(res[i]+" ");
                }
            }
        }
        public static int[] allIndx(int arr[],int val,int n,int c){
            if(n==arr.length) return new int[c];
//            int[] res;
            int[] res;
            if(arr[n]==val){
                res = allIndx(arr, val, n + 1, c + 1);
            res[c]=n;
            }
        else{
                res = allIndx(arr, val, n + 1, c);
            }
            return res;

        }
}
