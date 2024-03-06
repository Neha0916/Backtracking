import java.util.Scanner;
public class minimumSubsetSum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int[] nums =new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the value");
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        String s[]=new String[k];
        for(int i=0;i<k;i++){
            s[i]="";
        }
        solution(nums,s,k,0);
        System.out.println(res);
    }
    static int min=Integer.MAX_VALUE;
    static String res="";
    public static void solution(int[] nums,String s[],int k,int n){
        if(n==nums.length){
            if(valid(s)){
               int x=sum(s[0]);
               int y=sum(s[1]);
               if(Math.abs(x-y)<min){
                   min=Math.abs(x-y);
                   res="["+s[0]+"]"+"["+s[1]+"]";
               }
            }
//            for(int i=0;i<k;i++){
//                System.out.print("["+s[i]+"]");
//            }
            return;
        }
        for(int i=0;i<k;i++){
            String temp=s[i];
            s[i]+=nums[n];
            solution(nums,s,k,n+1);
            s[i]=temp;
        }
    }
    public static boolean valid(String[]str){
        if(str[0].equals("")||str[1].equals("")||Math.abs(str[0].length()-str[1].length())>1) return false;
        return true;
    }
    public static int sum(String s){
        int x=0;
        for(int i=0;i<s.length();i++){
            x+=Integer.parseInt(s.substring(i,i+1));
        }
        return x;
    }
}
