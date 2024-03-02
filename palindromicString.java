import java.util.Scanner;
import java.util.ArrayList;
public class palindromicString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the String");
        String s=sc.next();
        ArrayList<String> arr=new ArrayList<>();
        diffPalindrome(s,"");

    }
    public static void diffPalindrome(String s,String res){
        if(s.equals("")){
            System.out.println(res+" ");
            return;
        }
        for(int i=0;i<s.length();i++){
            if(checkPalindrome(s.substring(0,i+1))){
                diffPalindrome(s.substring(i+1,s.length()),res+" ("+s.substring(0,i+1)+")");
            }
        }
    }
    public static boolean checkPalindrome(String s){
        boolean bool=false;
        String rev="";
        for(int i=0;i<s.length();i++){
            rev=s.charAt(i)+rev;
        }
        if(rev.equals(s)) return true;
        return false;
    }

}
