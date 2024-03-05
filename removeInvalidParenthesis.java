import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class removeInvalidParenthesis {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        solution(str,getMin(str),new HashSet<>());
    }
    public static int getMin(String str){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char s=str.charAt(i);
            if(s=='('){
                stack.push(s);
            }
            else if(stack.isEmpty()){
                stack.push(s);
            }
            else{
                if(stack.peek()=='('&&s==')'){
                    stack.pop();
                }
                else{
                    stack.push(s);
                }
            }
        }
        return stack.size();
    }
    public static void solution(String str,int min,HashSet<String> hs){
        if(min==0){
            if(getMin(str)==0) {
                if(!hs.contains(str)) {
                    System.out.println(str);
                    hs.add(str);
                }
            }
            return;
        }
        for(int i=0;i<str.length();i++){
            String left=str.substring(0,i);
            String right=str.substring(i+1);
            solution(left+right,min-1,hs);
        }
    }
}
