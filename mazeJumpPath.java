import java.util.Scanner;
import java.util.ArrayList;
public class mazeJumpPath {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("Enter the value of m");
        int m=sc.nextInt();
        jumpMaze(n,m,"");
        System.out.println(res);
    }
    static ArrayList<String> res=new ArrayList<>();
    public static void jumpMaze(int n,int m,String s){
        if((n-1)==0&&(m-1)==0){
            res.add(s);
        }
        else if(n<0||m<0) return;

        for(int i=1;i<n;i++){
            jumpMaze(n-i,m,"h"+i+""+s);
        }
        for(int j=1;j<m;j++){
            jumpMaze(n,m-j,"v"+j+""+s);
        }
        for(int j=1;j<n;j++){
            jumpMaze(n-j,m-j,"d"+j+""+s);
        }
    }
}
