import java.util.Scanner;
public class suduko {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int [][]sudo=new int[9][9];
        for(int i=0;i<9;i++){
            System.out.println("Enter the value for "+i+"th row seperated by space");
            String values[]=sc.nextLine().split(" ");
            for(int j=0;j<9;j++){
                sudo[i][j]=Integer.parseInt(values[j]);
            }
        }
        workSudo(sudo,0,0);

    }
    public static void workSudo(int[][]sudo,int i,int j){
        if(i==9){
            for(int a=0;a<9;a++){
                for(int b=0;b<9;b++){
                    System.out.print(sudo[a][b]+" ");
                }
                System.out.println("");
            }
            return;
        }
        int ni=0;
        int nj=0;
        if(j>=8){
            ni=i+1;
            nj=0;
        }
        else{
            ni=i;
            nj=j+1;
        }

        if(sudo[i][j]!=0){
            workSudo(sudo,ni,nj);
        }
        else{
            for(int val=1;val<=9;val++){
                if(isValid(sudo,i,j,val)==true){
                    sudo[i][j]=val;
                    workSudo(sudo,ni,nj);
                    sudo[i][j]=0;
                }
            }
        }
    }
    public static boolean isValid(int[][]sudo,int x,int y,int val){
        for(int i=0;i<sudo.length;i++){
            if(sudo[x][i]==val)
                return false;
        }
        for(int i=0;i<sudo.length;i++){
            if(sudo[i][y]==val)
                return false;
        }
        int ni=x/3*3;
        int nj=y/3*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(sudo[ni+i][nj+j]==val)
                    return false;
            }
        }
        return true;
    }
}
