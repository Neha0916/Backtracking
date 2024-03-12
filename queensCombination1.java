import java.util.Scanner;
public class queensCombination1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of queens");
        int k=sc.nextInt();

        solution(0,k,0,0,"");
    }
    public static void solution(int qpsf,int q,int row,int col,String s){
        if(row==q){
            if(qpsf==q){
                System.out.println(s);
            }
            return;
        }
        String placed="";
        String unplaced="";
        int nr=0,nc=0;
        if(col==q-1){
            nr=row+1;
            nc=0;
            placed=s+"q\n";
            unplaced=s+"-\n";
        }
        else{
            nr=row;
            nc=col+1;
            placed=s+"q";
            unplaced=s+"-";
        }
        solution(qpsf+1,q,nr,nc,placed);
        solution(qpsf+0,q,nr,nc,unplaced);
    }
}
