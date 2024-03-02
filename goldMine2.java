import java.util.Scanner;
public class goldMine2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        sc.nextLine();
        int values[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter space-separated values for row " + i + ": ");
            String[] inputValues = sc.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                values[i][j] = Integer.parseInt(inputValues[j]);
            }
        }
        getGoldVal(values);
    }
    public static void getGoldVal(int values[][]){
        int n=values.length;
        int max=0;
        boolean [][]visited=new boolean[n][n];
        for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               max=Math.max(goldCal(values,0,i,j,visited),max);
            }
        }
        System.out.println(max);
    }
    public static int goldCal(int [][]values,int sum,int i,int j,boolean [][] visited){
        if(i<0||j<0||i>values.length-1||j>values.length-1||visited[i][j]||values[i][j]==0)
            return sum;
        visited[i][j]=true;
        int right=goldCal(values,sum+values[i][j],i,j+1,visited);
        int bottom=goldCal(values,sum+values[i][j],i+1,j,visited);
        int left=goldCal(values,sum+values[i][j],i,j-1,visited);
        int top=goldCal(values,sum+values[i][j],i-1,j,visited);
        visited[i][j]=false;
        return Math.max(Math.max(left,right),Math.max(top,bottom));
    }
}
