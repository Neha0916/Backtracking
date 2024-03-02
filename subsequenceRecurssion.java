//import java.util.Scanner;
//import java.util.ArrayList;
import java.io.*;
import java.util.*;
public class subsequenceRecurssion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any word");
        String str=sc.next();
        ArrayList<String> arr=subseq(str);
        for(String s:arr){
            System.out.print(s+" ");
        }
    }
    public static ArrayList<String> subseq(String str){
        if(str.equals("")) {
            ArrayList<String> res=new ArrayList<>();
            res.add("_");
            return res;
        }

        char ch=str.charAt(0);
        String st=str.substring(1);
        ArrayList<String> arr=subseq(st);
        ArrayList<String> res=new ArrayList<>();
        for(String s:arr){
            res.add(""+s);
            res.add(ch+""+s);
        }
        return res;
    }
}
