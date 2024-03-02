import java.util.Scanner;
public class printKeyboardSequence {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numeric sequence");
        String seq=sc.next();
        kbSeq(seq,"");
    }
    static String kb[]={",;","abc","def","ghi","jkl","mnop","qrst","uv","wxyz","?/"};
    public static void kbSeq(String seq,String s){
        if(seq.equals("")){
            System.out.print(s+" ");
            return;
        }
        char ch=seq.charAt(0);
        String word=kb[ch-48];
        for(int i=0;i<word.length();i++){
            kbSeq(seq.substring(1),s+""+word.charAt(i));
        }
    }
}
