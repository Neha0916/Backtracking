import java.util.Scanner;
public class factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any value for calculating its factorial");
        int val=sc.nextInt();
        int num=fact(val);
        System.out.println("Factorial of value "+val+" is = "+num);
    }
    public static int fact(int val){
        if(val==1) return 1;
        return val*fact(val-1);
    }
}
