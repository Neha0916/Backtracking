import java.util.Scanner;
public class coinChange {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("Enter the value of coin to be taken");
        int coin=sc.nextInt();
        sc.nextLine();
//        String str[]=sc.next().split(" ");
        int []num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        sumCoin(num,0,"",0,coin);
    }
    public static void sumCoin(int[]num,int sum,String s,int i,int coin){
        if(i==num.length) return;
        if(sum+num[i]==coin){
            System.out.println(s+" "+num[i]);
        }
        sumCoin(num,sum,s,i+1,coin);
        sumCoin(num,sum+num[i],s+" "+num[i],i+1,coin);
    }
}
