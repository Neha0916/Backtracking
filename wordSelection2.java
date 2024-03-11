import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class wordSelection2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of K");
        int k=sc.nextInt();
        System.out.println("Enter the value of string");
        String s=sc.next();
        HashSet<Character> hs=new HashSet<>();
        String str="";
        for(int i=0;i<s.length();i++) {
            if (hs.contains(s.charAt(i))) continue;
            hs.add(s.charAt(i));
            str += s.charAt(i);
        }
        solution(str,1,k,-1,"");
    }
    public static void solution(String s,int idx,int k,int lc,String str){
        if(idx>k){
            System.out.println(str);
            return;
        }
        for(int i=lc+1;i<s.length();i++){
            char ch=s.charAt(i);
            solution(s,idx+1,k,i,str+ch);
        }
    }
}
