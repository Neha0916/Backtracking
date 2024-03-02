import java.util.Scanner;
public class powerxraisedton {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value x");
        int x=sc.nextInt();
        System.out.println("Enter a value n");
        int n=sc.nextInt();
        long res=power(x,n);
        System.out.println(res);
    }
    public static long power(int x,int n){
//        if(n==1) return x;
//        return x*power(x,n-1);
        if(n==0) return 1;

        long xpn2=power(x,n/2);
        long xn=xpn2*xpn2;
        if(n%2==1){
            xn=xn*x;
        }
        return xn;
    }
}
