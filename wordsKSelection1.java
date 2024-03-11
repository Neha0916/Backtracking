import java.util.HashSet;
import java.util.Scanner;
public class wordsKSelection1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of K");
        int k=sc.nextInt();
        System.out.println("Enter the value of String");
        String s=sc.next();
        HashSet<Character> hs=new HashSet<>();
        String str="";
        for(int i=0;i<s.length();i++){
            if(hs.contains(s.charAt(i))) continue;
            hs.add(s.charAt(i));
            str+=s.charAt(i);
        }
        solution(str,0,"",k);
    }
    public static void solution(String str,int idx,String s,int k){
        if(idx==str.length()){
            if(s.length()==k){
                System.out.println(s);
            }
            return;
        }
        solution(str,idx+1,s,k);
        solution(str,idx+1,s+str.charAt(idx),k);
    }
}
