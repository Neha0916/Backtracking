import java.util.Scanner;
public class printDecInc {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int num=sc.nextInt();
        print(num);
    }
    public static void print(int num){
        if(num==0) return;
        System.out.println(num);
        print(num-1);
    }
}
