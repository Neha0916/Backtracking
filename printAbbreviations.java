import java.util.Scanner;
public class printAbbreviations {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of sequence");
        String seq=sc.next();
        String binary[]=new String[(int)(Math.pow(2,seq.length()))];
//        fillBinary(binary,seq.length(),0);
//        for(String s:binary){
//            System.out.println(s);
//        }
        printTask(seq,0,"",0);
    }
    public static void printTask(String seq,int n,String res,int count){
        if(n==seq.length()){
            if(res.equals("")) System.out.print(count+" ");
            else{
                System.out.print(count==0?res+" ":res+""+count+" ");
            }
            return;
        }
        char ch=seq.charAt(n);
        printTask(seq,n+1,res,count+1);
        printTask(seq,n+1,count==0?res+ch:res+count+""+ch,0);
    }
//    public static void fillBinary(String[]binary,int n,int i){
//        if(i==binary.length) return;
//q
//        int temp=i;
//        String s="";
//        while(temp>0){
//            int r=temp%2;
//            s=r+""+s;
//            temp=temp/2;
//        }
//        while(s.length()!=n){
//            s="0"+s;
//        }
//        binary[i]=s;
//        fillBinary(binary,n,i+1);
//    }
}
