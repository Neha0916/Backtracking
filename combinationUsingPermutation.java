import java.util.Scanner;
public class combinationUsingPermutation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of boxes");
        int box=sc.nextInt();
        System.out.println("Enter the number of values");
        int n=sc.nextInt();
        if(n==0||box==0) return;
        System.out.println("Enter the value");
        int values[]=new int[n];
        for(int i=0;i<n;i++){
            values[i]=sc.nextInt();
        }
        int boxes[]=new int[box];
        boolean []bool=new boolean[box];
        solution(0,0,boxes,values,bool);
    }
    public static void solution(int idx,int i,int[]boxes,int values[],boolean[]bool){
        if(idx==values.length){
            if(check(bool,idx)){
                for(int ii=0;ii<boxes.length;ii++){
                    if(bool[ii]==false){
                        System.out.print("_");
                    }
                    else{
                        System.out.print("i");
                    }
                }
                System.out.println();
            }
            return;
        }
        for(int ii=i;ii<boxes.length;ii++){
            if(bool[ii]==false){
                bool[ii]=true;
                solution(idx+1,ii,boxes,values,bool);
                bool[ii]=false;
            }
        }
    }
    public static boolean check(boolean [] bool,int n){
        int c=0;
        for(boolean b:bool){
            if(b) c++;
        }
        if(c==n) return true;
        return false;
    }
}
