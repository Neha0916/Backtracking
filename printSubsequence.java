import java.util.Scanner;
import java.util.ArrayList;
public class printSubsequence {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sequence");
        String str=sc.next();
        subS(str,"");
    }
    public static void subS(String str,String s){
        if(str.equals("")) {
            System.out.print(s+" ");
            return;
        }
        char ch=str.charAt(0);
        subS(str.substring(1),s+""+ch);
        subS(str.substring(1),s+"_");
    }


}
