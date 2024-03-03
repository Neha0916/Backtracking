import java.util.*;

public class cryotarithmeticPuzzle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String one=sc.nextLine();
        String two=sc.nextLine();
        String three=sc.nextLine();

        HashMap<Character,Integer> hm=new HashMap<>();
        String unique="";
        for(int i=0;i<one.length();i++){
            if(!hm.containsKey(one.charAt(i))){
                hm.put(one.charAt(i),-1);
                unique+=one.charAt(i);
            }
        }
        for(int i=0;i<two.length();i++){
            if(!hm.containsKey(two.charAt(i))){
                hm.put(two.charAt(i),-1);
                unique+=two.charAt(i);
            }
        }
        for(int i=0;i<three.length();i++){
            if(!hm.containsKey(three.charAt(i))){
                hm.put(three.charAt(i),-1);
                unique+=three.charAt(i);
            }
        }
        System.out.println(unique);
        boolean[] usedNumber=new boolean[10];
        solution(unique,0,hm,usedNumber,one,two,three);
    }
    public static void solution(String unique,int idx,HashMap<Character,Integer>hm,boolean[] usedNumber,String s1,String s2,String s3){
        if(idx==unique.length()){
            int num1=findNum(s1,hm);
            int num2=findNum(s2,hm);
            int num3=findNum(s3,hm);
            if(num1+num2==num3){
                print(hm);
            }
            return;
        }
        for(int i=0;i<10;i++){
            if(!usedNumber[i]){
                usedNumber[i]=true;
                hm.put(unique.charAt(idx),i);

                solution(unique,idx+1,hm,usedNumber,s1,s2,s3);
//                System.out.println(hm.get(unique.charAt(idx)));
                usedNumber[i]=false;
                hm.put(unique.charAt(idx),-1);
            }
        }
    }
    public static int findNum(String s,HashMap<Character,Integer>hm){
        int x=0;
        for(int i=0;i<s.length();i++){
            x=x*10+hm.get(s.charAt(i));
        }
        return x;
    }
    public static void print(HashMap<Character,Integer>hm){

        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            if(hm.containsKey(ch)){
                System.out.print(ch+" "+hm.get(ch)+", ");
            }
        }
        System.out.println();
//        for(Map.Entry<Character,Integer> entry:hm.entrySet()){
//            System.out.print(entry.getKey()+" "+entry.getValue()+" , ");
//        }
//        System.out.println();
    }
}
