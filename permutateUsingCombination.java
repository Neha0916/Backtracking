import java.util.Scanner;
public class permutateUsingCombination {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of boxes");
        int box=sc.nextInt();
        System.out.println("Enter the value of values");
        int n=sc.nextInt();
        if(n==0||box==0) return;
        System.out.println("Enter the value");
        int values[]=new int[n];
        for(int i=0;i<n;i++){
            values[i]=sc.nextInt();
        }
        int boxes[]=new int[box];
        boolean []bool=new boolean[box];
        solution(0,boxes,values,bool);
    }
    public static void solution(int idx,int[]boxes,int[]values,boolean[]bool){
        if(idx==values.length){
            if(check(bool,idx)){
                for(int i=0;i<boxes.length;i++){
                    if(boxes[i]==0){
                        System.out.print("_");
                    }
                    else{
                        System.out.print(boxes[i]);
                    }
                }
                System.out.println();
            }
            return;
        }
        solution(idx+1,boxes,values,bool);
        for(int i=0;i<boxes.length;i++){
            if(bool[i]==false){
                bool[i]=true;
               boxes[i]=values[idx];
               solution(idx+1,boxes,values,bool);
               boxes[i]=0;
               bool[i]=false;
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
