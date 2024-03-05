import java.util.Scanner;
import java.util.ArrayList;
public class wordBreakProblem {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of String");
        String s=sc.next();
        sc.nextLine();
        System.out.println("Enter the value of different strings seperated by space");
        String str[]=sc.nextLine().split(" ");
        ArrayList<String>arr=new ArrayList<>();
        for(int i=0;i<str.length;i++){
            arr.add(str[i]);
        }
        solution(arr,s,"");
    }
    public static void solution(ArrayList<String> arr,String s,String res){
        if(s.length()==0){
            System.out.println(res);
            return;
        }
        for(int i=0;i<s.length();i++){
            String left=s.substring(0,i+1);
            String right=s.substring(i+1);
            if(arr.contains(left)){
                solution(arr,right,res+" "+left);
            }
            continue;
        }
    }
}
