import java.util.Scanner;
public class knightMoves {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("Enter the value of r");
        int r=sc.nextInt();
        System.out.println("Enter the value of c");
        int c=sc.nextInt();
        int chess[][]=new int[n][n];
        knight(chess,r,c,1);
    }
    public static void knight(int[][] chess,int r,int c,int move) {
        if(r<0||c<0||r>=chess.length||c>=chess.length||chess[r][c]>0) return;
        else if(move==chess.length*chess.length){
            chess[r][c]=move;
            display(chess);
            chess[r][c]=0;
            return;
        }
        chess[r][c]=move;
        knight(chess,r-2,c+1,move+1);
        knight(chess,r-1,c+2,move+1);
        knight(chess,r+1,c+2,move+1);
        knight(chess,r+2,c+1,move+1);
        knight(chess,r+2,c-1,move+1);
        knight(chess,r+1,c-2,move+1);
        knight(chess,r-1,c-2,move+1);
        knight(chess,r-2,c-1,move+1);
        chess[r][c]=0;
    }
    public static void display(int[][]chess){
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess.length;j++){
                System.out.print(chess[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
