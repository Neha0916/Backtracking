import java.util.Scanner;
public class friendsPairing {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        boolean bool[]=new boolean[n+1];
        findPair(n,1,bool,"");
    }
    public static void findPair(int n,int idx,boolean[]bool,String s){
        if(idx>n){
            System.out.println(s);
            return;
        }
        if(bool[idx]==true){
            findPair(n,idx+1,bool,s);
        }
        else{
            bool[idx]=true;
            findPair(n,idx+1,bool,s+"["+idx+"] ");
            for(int i=idx+1;i<=n;i++){
                if(bool[i]==false){
                    bool[i]=true;
                    findPair(n,idx+1,bool,s+"["+idx+i+"]");
                    bool[i]=false;
                }
            }
            bool[idx]=false;
        }
    }
}
