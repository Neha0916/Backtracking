import java.util.Scanner;
public class NQueens {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int chess[][]=new int[n][n];
        nQueen(chess,"",0);
    }

    public static void nQueen(int[][]chess ,String s,int i){
//        System.out.println(i);
        if(i==chess.length){
            System.out.println(s);
            return;
        }
        for(int j=0;j<chess.length;j++){
            if(itIsSafe(chess,i,j)==true) {

                chess[i][j] = 1;
                nQueen(chess, s + "" + i + "" + j + " ", i + 1);
                chess[i][j] = 0;
            }
        }
    }
    public static boolean itIsSafe(int [][]chess,int row,int col){
        for(int i=row-1,j=col;i>=0;i--){
            if(chess[i][j]==1) return false;
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(chess[i][j]==1) return false;
        }
        for(int i=row-1,j=col+1;i>=0&&j<chess.length;i--,j++){
            if(chess[i][j]==1) return false;
        }
        return true;
    }
}
