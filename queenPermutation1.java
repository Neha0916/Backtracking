import java.util.Scanner;
public class queenPermutation1 {
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value of queens");
            int k=sc.nextInt();
            int chess[][]=new int[k][k];
            solution(0,k,chess);
        }
        public static void solution(int qpsf,int q,int[][]chess){
        if(qpsf==q){
            for(int i=0;i<q;i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(chess[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for(int i=0;i<q;i++){
            for(int j=0;j<q;j++){
                if(chess[i][j]==0){
                    chess[i][j]=qpsf+1;
                    solution(qpsf+1,q,chess);
                    chess[i][j]=0;
                }
            }
        }
    }

}
