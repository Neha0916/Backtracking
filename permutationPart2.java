import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class permutationPart2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of string");
        String s=sc.next();
        String[]boxes=new String[s.length()];
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++) {
            hm.put(s.charAt(i), -1);
        }
        solution(0,boxes,s,hm);
    }

    public static void solution(int idx,String[]boxes,String s,HashMap<Character,Integer>hm){
        if(idx==s.length()){
            for(int i=0;i<s.length();i++){
                System.out.print(boxes[i]);
            }
            System.out.println();
            return;
        }
        char ch=s.charAt(idx);
        int ii=hm.get(ch);
        for(int i=ii+1;i<boxes.length;i++){
            if(boxes[i]==null){
                boxes[i]=ch+"";
                hm.put(ch,i);
                solution(idx+1,boxes,s,hm);
                boxes[i]=null;
                hm.put(ch,ii);
            }
        }
    }
}
