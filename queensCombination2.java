import java.util.HashSet;
import java.util.Scanner;

public class queensCombination2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of queens");
        int k=sc.nextInt();
        boolean chess[][]=new boolean[k][k];

        solution(0,k,chess,0,-1);
    }
    public static void solution(int qpsf,int q,boolean[][]chess,int row,int lp){
//        if(qpsf==q){
            if(qpsf==q){
                for(int i=0;i<q;i++){
                    for(int j=0;j<q;j++){
                        if(chess[i][j]==true){
                            System.out.print("q");

                        }
                        else{
                            System.out.print("_");
                        }
                    }
                    System.out.println();
                }
                System.out.println("\n");
//            }
            return;
        }
        for(int i=lp+1;i<q;i++){
//            if(chess[row][i]==false){
                chess[row][i]=true;
                solution(qpsf+1,q,chess,row,i);
                chess[row][i]=false;
//            }
        }
        for(int i=row+1;i<q;i++){
            for(int col=0;col<q;col++){
                chess[i][col]=true;
                solution(qpsf+1,q,chess,i,col);
                chess[i][col]=false;
            }
        }
    }
}
