import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class permutationOfString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number of boxes");
//        int box=sc.nextInt();
        System.out.println("Enter the String");
        String s=sc.next();
        int box=s.length();
        if(s.length()==0) return;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }

        String boxes[]=new String[box];
        for(int i=0;i<box;i++){
            boxes[i]="";
        }
//        boolean []bool=new boolean[box];
        solution(0,hm,boxes,s);
    }
    public static void solution(int idx,HashMap<Character,Integer>hm,String[]boxes,String s){
        if(idx==boxes.length){
            if(hm.size()==0){
                for(int i=0;i<boxes.length;i++){
                    System.out.print(boxes[i].equals("")?"_":boxes[i]);
                }
                System.out.println();
            }
            return;
        }
        Set<Character> keySetCopy = new HashSet<>(hm.keySet());
        for (Character ch : keySetCopy) {
            boxes[idx]=ch+"";
            hm.put(ch,hm.get(ch)-1);
            if(hm.get(ch)==0) hm.remove(ch);
            solution(idx+1,hm,boxes,s);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
    }
}
