import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
public class wordPatternMatching {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of String");
        String n=sc.next();
        System.out.println("Enter the value of Pattern");
        String pattern=sc.next();
        HashMap<Character,String> hm=new HashMap<>();
        solution(hm,n,pattern,0);
    }
    public static void solution(HashMap<Character,String>hm,String n,String pattern,int idx){
        if(idx==pattern.length()){
            if(n.length()==0){
                HashSet<Character>hs=new HashSet<>();
                for(int i=0;i<idx;i++){
                    if(hs.contains(pattern.charAt(i))) continue;
                    hs.add(pattern.charAt(i));
                    System.out.print(pattern.charAt(i)+"->"+hm.get(pattern.charAt(i))+" ");
                }
            }
            return;
        }
        if(hm.containsKey(pattern.charAt(idx))) {

            String mapChar = hm.get(pattern.charAt(idx));
            if (n.length() >= mapChar.length()) {
                String curr = n.substring(0, mapChar.length());
                if (curr.equals(mapChar)) {
                    solution(hm, n.substring(mapChar.length()), pattern, idx + 1);
                }

            }
        }
        else{
            for(int i=0;i<n.length();i++){
                hm.put(pattern.charAt(idx),n.substring(0,i+1));
                solution(hm,n.substring(i+1),pattern,idx+1);
                hm.remove(pattern.charAt(idx));
            }
        }
    }
}
