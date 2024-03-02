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
        totalCoin(num,0,coin,0,"");
    }
    public static void totalCoin(int[]num,int sum,int coin,int i,String s){
        if(i==num.length){
            if(sum==coin) System.out.println(s);
            return;
        }
//        if(sum==coin) {
//            System.out.println(s);
//            return;
//        }
        for(int j=sum/num[i];j>=1;j--){
            String add="";
            for(int k=0;k<j;k++){
                add+=" "+num[i];
            }
            totalCoin(num,sum+num[i]*j,coin,i+1,s+" "+add);
        }
        totalCoin(num,sum,coin,i+1,s);
    }
}
