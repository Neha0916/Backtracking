import java.util.Scanner;
public class printStairCase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sC(n,"");
    }
    public static void sC(int n, String s){
//
        if(n==0){
           System.out.print(s+" ");
        }
        else if(n<0) return;
        sC(n-1,1+""+s);
        sC(n-2,2+""+s);
        sC(n-3,3+""+s);
    }
}
