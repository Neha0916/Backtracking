import java.util.Scanner;
import java.util.ArrayList;
public class keyboardSequence {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any sequence of numbers");
        String n=sc.next();
        String [] kb={".;","abc","def","ghi","jkl","mnop","qrst","uv","wxyz","?!"};
        ArrayList<String> res=seq(n,kb);
        System.out.println("The obtained sequence is "+res);

    }
    public static ArrayList<String> seq(String n,String [] kb){
        if(n.equals("")){
            ArrayList<String> nres=new ArrayList<>();
            nres.add("");
            return nres;
        }
        char ch=n.charAt(0);
        ArrayList<String> res=seq(n.substring(1),kb);
        ArrayList<String> mres=new ArrayList<>();

        for(String str:res){
            if(ch=='0'){
                for(int i=0;i<kb[0].length();i++){
                    mres.add(kb[0].charAt(i)+""+str);
                }
            }
            else if(ch=='1'){
                for(int i=0;i<kb[1].length();i++){
                    mres.add(kb[1].charAt(i)+""+str);
                }
            }
            else if(ch=='2'){
                for(int i=0;i<kb[2].length();i++){
                    mres.add(kb[2].charAt(i)+""+str);
                }
            }
            else if(ch=='3'){
                for(int i=0;i<kb[3].length();i++){
                    mres.add(kb[3].charAt(i)+""+str);
                }
            }
            else if(ch=='4'){
                for(int i=0;i<kb[4].length();i++){
                    mres.add(kb[4].charAt(i)+""+str);
                }
            }
            else if(ch=='5'){
                for(int i=0;i<kb[5].length();i++){
                    mres.add(kb[5].charAt(i)+""+str);
                }
            }
            else if(ch=='6'){
                for(int i=0;i<kb[6].length();i++){
                    mres.add(kb[6].charAt(i)+""+str);
                }
            }
            else if(ch=='7'){
                for(int i=0;i<kb[7].length();i++){
                    mres.add(kb[7].charAt(i)+""+str);
                }
            }
            else if(ch=='8'){
                for(int i=0;i<kb[8].length();i++){
                    mres.add(kb[8].charAt(i)+""+str);
                }
            }
            else if(ch=='9') {
                for (int i = 0; i < kb[9].length(); i++) {
                    mres.add(kb[9].charAt(i) + "" + str);
                }
            }
        }
        return mres;
    }
}
