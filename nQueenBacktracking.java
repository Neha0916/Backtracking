import java.util.Scanner;
public class nQueenBacktracking {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int chess[][]=new int[n][n];
        boolean col[]=new boolean[n];
        boolean d1[]=new boolean[2*n-1];
        boolean d2[]=new boolean[2*n-1];
        printNQueens(chess,0,col,d1,d2,"");
    }
    public static void printNQueens(int[][]chess,int i,boolean col[],boolean[]d1,boolean[]d2,String qsf){
        if(i==chess.length){
            System.out.println(qsf);
            return;
        }
        for(int j=0;j<chess.length;j++){
//            System.out.println(col[j]&&d1[i+j]&&d2[i-j+chess.length-1]);
            if(col[j]==false&&d1[i+j]==false&&d2[i-j+chess.length-1]==false){
                col[j]=true;
                d1[i+j]=true;
                d2[i-j+chess.length-1]=true;
                printNQueens(chess,i+1,col,d1,d2,qsf+"("+i+","+j+") ");
                col[j]=false;
                d1[i+j]=false;
                d2[i-j+chess.length-1]=false;
            }
        }
    }
}
