import java.util.Scanner;

public class kSwapsMax {
    static String max="";
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of String");
        String str=sc.next();
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        max=str;
        solution(str,k);
        System.out.println(max);
    }
    public static void solution(String str,int k){
        if(Integer.parseInt(str)>Integer.parseInt(max)){
            max=str;
        }
        if(k==0) return;
        for(int i=0;i<str.length()-1;i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)<str.charAt(j)){
                    String sw=swap(str,i,j);
                    solution(sw,k-1);
                }
            }
        }
    }
    public static String swap(String str,int i,int j){
        String s1=str.substring(0,i);
        String s2=str.substring(i+1,j);
        String s3=str.substring(j+1);
        str=s1+str.charAt(j)+s2+str.charAt(i)+s3;
        return str;
    }
}
