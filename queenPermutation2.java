import java.util.Scanner;
public class queenPermutation2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of queens");
        int k=sc.nextInt();
        boolean[]bool=new boolean[k];
        solution(0,k,0,0,"",bool);
    }
    public static void solution(int qpsf,int q,int row,int col,String s,boolean bool[]){
        if(row==q){
            if(qpsf==q){
                System.out.println(s);
            }
            return;
        }
        int cr=0,cc=0;
        String sep="";
        if(col==q-1){
            cr=row+1;
            cc=0;
            sep="\n";
        }
        else{
            cr=row;
            cc=col+1;
            sep="\t";
        }
        for(int i=0;i<q;i++){
            if(bool[i]==false){
                bool[i]=true;
                solution(qpsf+1,q,cr,cc,s+"q"+(i+1)+sep,bool);
                bool[i]=false;
            }
        }
        solution(qpsf,q,cr,cc,s+"_"+sep,bool);
    }
}
