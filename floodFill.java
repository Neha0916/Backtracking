import java.util.Scanner;
import java.util.ArrayList;
public class floodFill {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("Enter the value of m");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("Enter the value of ["+i+"] ["+j+"] element");
                arr[i][j]=sc.nextInt();
            }
        }
        fFill(arr,0,0,"",visited);
    }
    public static void fFill(int arr[][],int n,int m,String s,boolean visited[][]){
        if(n<0||m<0||n==arr.length||m==arr[0].length||arr[n][m]==1||visited[n][m]) return;
        if(n==arr.length-1&&m==arr[0].length-1){
            System.out.print(s+" ");
            return;
        }
            visited[n][m]=true;
            fFill(arr,n-1,m,s+"t",visited);
            fFill(arr,n+1,m,s+"b",visited);
            fFill(arr,n,m-1,s+"l",visited);
            fFill(arr,n,m+1,s+"r",visited);
            visited[n][m]=false;
    }
}
