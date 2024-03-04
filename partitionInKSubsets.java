import java.util.Scanner;
public class partitionInKSubsets {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        if(n==0) return;
        System.out.println("Enter the value of k");
        int k=sc.nextInt();

        String[] s = new String[k];
        String temp="";

        for(int i=1;i<=n;i++){
            temp+=i+"";
        }
        if(k==0||n<k){ System.out.println(temp); return ;}
        if(n==k){
            String t="";

            for(int i=1;i<=n;i++){
                t+=" "+i;
            }
            System.out.println(t); return ;
        }
        for (int i = 0; i < k; i++) {
            s[i] = ""; // Initialize each element with an empty string
        }
        s[0]=1+"";
        findSets(n,k,s,2);
    }
    public static void findSets(int n,int k,String[]s,int idx){
        if(idx>n){
            if(check(s,k)){
                for(int i=0;i<k;i++){
                    System.out.print("["+s[i]+"]");
                }
                System.out.println();
            }
            return;
        }
        for(int i=0;i<k;i++){
//            String temp=s[i];
            s[i]+=idx+"";
            findSets(n,k,s,idx+1);
            s[i]=s[i].replace(idx+"","");
        }
    }
    public static boolean check(String []s,int k){
        for(int i=0;i<k;i++){
            if(s[i]==null||s[i].equals("")) return false;
        }
        return true;
    }
}
