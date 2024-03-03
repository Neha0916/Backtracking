import java.util.Scanner;
public class coinChange2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("Enter the value of coin");
        int coin=sc.nextInt();
        int[]num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        totalCoin(num,coin,0,"");
    }
    public static void totalCoin(int[]num,int sum,int i,String s){
        if(sum==0){
            System.out.println(s);
            return;
        }
        if(sum<0) return;
        if(i>=num.length) return;
        totalCoin(num,sum-num[i],i,s+" "+num[i]);
        totalCoin(num,sum,i+1,s);
    }
}
