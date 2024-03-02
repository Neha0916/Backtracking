import java.util.Scanner;

public class printMazePath {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("Enter the value of m");
        int m=sc.nextInt();
        maze(0,0,n,m,"");
    }
    public static void maze(int xi,int yi,int n,int m,String s){
        if(xi==n-1&&yi==m-1){
            System.out.print(s+" ");
            return;
        }
        else if(xi==n||yi==m) return;
        maze(xi+1,yi,n,m,"h"+s);
        maze(xi,yi+1,n,m,"v"+s);
    }
}
