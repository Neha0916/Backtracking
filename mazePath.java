import java.util.Scanner;
import java.util.ArrayList;
public class mazePath {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("Enter the value of m");
        int m=sc.nextInt();
        maze(0,0,n,m,"");
        System.out.println(res);
    }
    static ArrayList<String> res=new ArrayList<>();
    public static void maze(int xi,int yi,int n,int m,String s){
        if(xi==n-1&&yi==m-1){
            res.add(s);
            return;
        }
        else if(xi==n||yi==m) return;
        maze(xi+1,yi,n,m,"h"+s);
        maze(xi,yi+1,n,m,"v"+s);
    }
}
