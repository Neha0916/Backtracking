import java.util.Scanner;
public class printEncoding {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the code");
        String code=sc.next();
        decode(code,"");
    }
    static String seq[]={"a","b","c","d","e","f","g","h",
            "i","j","k","l","m","n","o","p",
            "q","r","s","t","u","v","w","x","y","z"};
    public static void decode(String code,String s){
        if(code.equals("")){
            System.out.print(s+" ");
            return;
        }
        if(code.charAt(0)-48-1>0)
        decode(code.substring(1),s+""+seq[code.charAt(0)-48-1]);
        if(code.length()>1){
            String res=code.substring(0,2);
            if(Integer.parseInt(res)>0&&Integer.parseInt(res)<=26)
                decode(code.substring(2),s+""+seq[Integer.parseInt(res)-1]);
        }
    }
}
