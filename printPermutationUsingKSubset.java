import java.util.Scanner;
public class printPermutationUsingKSubset {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of boxes");
        int k=sc.nextInt();
        System.out.println("Enter the value of objects");
        int n=sc.nextInt();
        String[]boxes=new String[k];
        boolean[]bool=new boolean[k];
        for(int i=0;i<k;i++){
            boxes[i]="";
        }
        solution(n,k,boxes,bool);

    }
    public static void solution(int n,int k,String[]boxes,boolean[]bool){
        if(n==0){
            for(int i=0;i<k;i++){
                System.out.print("["+boxes[i]+"]");
            }
            System.out.println();
            return;
        }
        for(int i=0;i<k;i++){
            if(bool[i]==false) {
                bool[i]=true;
                String temp = boxes[i];
                boxes[i] += n;
                solution(n - 1, k, boxes,bool);
                boxes[i] = temp;
                bool[i]=false;
            }
        }
    }
}
