import java.util.Scanner;

public class printCominationOfSelectedItems {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of boxes");
        int k=sc.nextInt();
        System.out.println("Enter the value of objects");
        int n=sc.nextInt();
        int[]boxes=new int[k];
        boolean[]bool=new boolean[k];

        solution(0,n,k,boxes,bool);

    }
    public static void solution(int idx,int n,int k,int[]boxes,boolean[]bool){
        if(idx==k){
            int c=0;
            for(int i=0;i<k;i++){
                if(bool[i]) c++;
            }
            if(c!=2) return;

            for(int i=0;i<k;i++){
                if(bool[i]){
                    System.out.print("i");
                }
                else {
                    System.out.print("_");
                }
            }
            System.out.println();
            return;
        }
        if(bool[idx]==false) {
            solution(idx+1,n,k,boxes,bool);
            bool[idx]=true;
//            int temp = boxes[idx];
//            boxes[idx]= n;
            solution(idx+1,n , k, boxes,bool);
//            boxes[idx] = temp;
            bool[idx]=false;
        }
    }
}
