import java.util.HashSet;
import java.util.Scanner;
public class kLengthWord1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        System.out.println("Enter the value of string");
        String s=sc.next();
        HashSet<Character>hs=new HashSet<>();
        String str="";
        for(int i=0;i<s.length();i++){
            if(hs.contains(s.charAt(i))) continue;
            hs.add(s.charAt(i));
            str+=s.charAt(i);
        }
        String box[]=new String[k];
//        boolean[]bool=new boolean[k];
        solution(box,str,k,0,0);
    }
    public static void solution(String[]box,String str,int k,int idx,int c){
        if(idx==str.length()){
//            for(int i=0;i<k;i++){
//                if(bool[i]==false) return;
//            }
            if(c==k){
                for(int i=0;i<k;i++){
                    System.out.print(box[i]);
                }
                System.out.println();
            }
            return;
        }
        solution(box,str,k,idx+1,c);
        for(int i=0;i<box.length;i++){
            if(box[i]==null){
//                bool[i]=true;
                box[i]= str.charAt(idx)+"";
                solution(box,str,k,idx+1,c+1);
                box[i]=null;
//                bool[i]=false;
            }
        }
    }
}
