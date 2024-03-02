import java.util.*;
public class practice {
        public static void main(String []args){
            Scanner sc=new Scanner(System.in);

            String str=sc.next();
            if(password(str)==1)
                System.out.println("Correct");
            else
                System.out.println("Incorrect");

        }
        public static int password(String str){
            if(str.charAt(0)>=48&&str.charAt(0)<=58){
                return 0;
            }

            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==' '||str.charAt(i)=='/'){
                    return 0;
                }
            }

            int count=0;

            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>=65&&str.charAt(i)<=90){
                    count++;
                    break;
                }
            }
            if(count==0)
                return 0;

            int c=0;

            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>=97&&str.charAt(i)<=122){
                    c++;
                }
            }
            if(c>=4)
                count++;
            else
                return 0;


            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>=48&&str.charAt(i)<=58){
                    return 1;
                }
            }
            return 0;

        }
}
