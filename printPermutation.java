import java.util.Scanner;
public class printPermutation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String str=sc.next();
        pmt(str,"");
    }
    public static void pmt(String str,String s){
        if(str.equals("")){
            System.out.print(s+" ");
            return;
        }
        for(int i=0;i<str.length();i++){
            pmt(str.substring(0,i)+str.substring(i+1),s+""+str.charAt(i));
        }
    }
}
