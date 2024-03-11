import java.util.HashSet;
import java.util.Scanner;

public class kLengthWord2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        System.out.println("Enter the value of string");
        String s=sc.next();
        HashSet<Character> hs=new HashSet<>();
        String str="";
        for(int i=0;i<s.length();i++){
            if(hs.contains(s.charAt(i))) continue;
            hs.add(s.charAt(i));
            str+=s.charAt(i);
        }
        String box[]=new String[k];
       boolean[]bool=new boolean[str.length()];
        solution("",str,k,0,bool);
    }
    public static void solution(String s,String str,int k,int idx,boolean[]bool) {
        if (idx== k) {
            System.out.println(s);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if (bool[i] == false) {
                bool[i]=true;
                solution(s+str.charAt(i), str, k, idx + 1, bool);
                bool[i]=false;
            }
        }
    }
}
