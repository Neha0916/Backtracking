import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
class calTemp{
    int avg(int []x){
        int s=0;
        for(int i=0;i<x.length;i++){
            s=s+x[i];
        }
        s=s/x.length;
        return s;
    }
    int aboveAvg(int []x,int y){
        int c=0;
        for(int i=0;i<x.length;i++){
            if(x[i]>y){
                c++;
            }
        }
        return c;
    }
}
public class Temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of days");
        int n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the temperature of day "+(i+1));
            x[i]=sc.nextInt();
        }
        calTemp call=new calTemp();
        int avg=call.avg(x);
        System.out.println(call.aboveAvg(x,avg));
    }
}
