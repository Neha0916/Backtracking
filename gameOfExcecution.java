import java.util.Scanner;
import java.util.ArrayList;
public class gameOfExcecution {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        System.out.println("Enter the value of k");
        int k=sc.nextInt();

        System.out.println(game(n,k));
    }
    public static int game(int n,int k){
        if(n==1) {
           return 0;
        }
        int x=game(n-1,k);
        int y=(x+k)%n;
        return y;
    }
}
//1 2 3 4 5 6 -10