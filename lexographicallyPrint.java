import java.util.Scanner;
public class lexographicallyPrint {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        for(int i=1;i<=9;i++){
            dfs(i,n);
        }
    }
    public static void dfs(int i,int n){
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        for(int j=0;j<10;j++){
            dfs(i*10+j,n);
        }
    }
}
