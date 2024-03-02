import java.util.Scanner;
import java.util.ArrayList;
public class stairCase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sC(n,"");
        System.out.println(newP);
    }
    static ArrayList<String> newP=new ArrayList<>();
    public static void sC(int n, String s){
//        if(n==0){
//            ArrayList<String> np=new ArrayList<>();
//            np.add("");
//            return np;
//        }
//        else if(n<0) return new ArrayList<>();
//        ArrayList<String> p1=sC(n-1);
//        ArrayList<String> p2=sC(n-2);
//        ArrayList<String> p3=sC(n-3);
//
//        ArrayList<String> np=new ArrayList<>();
//
//        for(String s:p1){
//            np.add(1+""+s);
//        }
//        for(String s:p2){
//            np.add(2+""+s);
//        }
//        for(String s:p3){
//            np.add(3+""+s);
//        }
//        return np;
        if(n==0){
            newP.add(s);
        }
        else if(n<0) return;
        sC(n-1,1+""+s);
        sC(n-2,2+""+s);
        sC(n-3,3+""+s);
    }
}
