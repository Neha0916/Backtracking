import java.util.Scanner;
public class crossWordPuzzle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("Enter the value of row");
        int row=sc.nextInt();
        System.out.println("Enter the value of col");
        int col=sc.nextInt();
        sc.nextLine();
        String crossWord[][]=new String[row][col];
        for(int i=0;i<row;i++){
            String s[]=sc.nextLine().split(" ");
            for(int j=0;j<col;j++){
                crossWord[i][j]=s[j];
            }
        }
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }

        crosswordPuzzle(crossWord,arr,0);
    }
    public static void crosswordPuzzle(String[][]crossWord,String[]arr,int ind){
        if(ind==arr.length)
        {
            print(crossWord);
            return;
        }
        System.out.println(ind);
        String word=arr[ind];
//        System.out.println(word);
        for(int i=0;i<crossWord.length;i++){
            for(int j=0;j<crossWord[0].length;j++){

//                System.out.println(isWordPossibleHorizontal(crossWord,word,i,j)+" "+isWordPossibleVertical(crossWord,word,i,j));
               if(crossWord[i][j].equals("-")||crossWord[i][j].equals(word.charAt(0))){
                   if(isWordPossibleHorizontal(crossWord,word,i,j)){
                       boolean bool[]=placeWordHorizontal(crossWord,word,i,j);
                       crosswordPuzzle(crossWord,arr,ind+1);
                       unPlaceWordHorizontal(crossWord,bool,i,j);
                   }
                   else if(isWordPossibleVertical(crossWord,word,i,j)){
                       boolean bool[]=placeWordVertical(crossWord,word,i,j);
                       crosswordPuzzle(crossWord,arr,ind+1);
                       unPlaceWordVertical(crossWord,bool,i,j);
                   }
               }
            }
        }
    }
    public static boolean isWordPossibleHorizontal(String [][]crossWord,String word,int i,int j){
        if(j-1>=0&&!crossWord[i][j-1].equals("+")) {

//            System.out.print(" " + crossWord[i][j - 1] + " ");
            return false;
        }
        else if(j+word.length()<crossWord[0].length&&!crossWord[i][j+word.length()].equals("+")) {
//            System.out.print(crossWord[i][j + word.length()] + " ");
            return false;
        }
        for(int jj=0;jj<word.length();jj++){
            if(crossWord[i][j+jj].equals("-")||crossWord[i][j+jj].equals(word.charAt(jj)))
            {
//                continue;
            }
            else return false;
        }
        return true;
    }
    public static boolean isWordPossibleVertical(String [][]crossWord,String word,int i,int j){
        if(i-1>=0&&!crossWord[i-1][j].equals("+")) {
//            System.out.print(" " + crossWord[i - 1][j] + " ");
            return false;
        }
        if(i+word.length()<crossWord.length&&!crossWord[i+word.length()][j].equals("+")) {
//            System.out.print(" " + crossWord[i + word.length()][j] + " ");
            return false;
        }
        for(int ii=0;ii<word.length();ii++){
            if(crossWord[i+ii][j].equals("-")||crossWord[i+ii][j].equals(word.charAt(ii))) {
//              continue;
            }
            else return false;
        }
        return true;
    }
    public static boolean[] placeWordHorizontal(String [][]crossWord,String word,int i,int j){
        boolean []bool=new boolean[word.length()];
        for(int jj=0;jj<word.length();jj++){
            if(crossWord[i][j+jj].equals("-")){
                crossWord[i][j+jj]=word.charAt(jj)+"";
                bool[jj]=true;
            }
        }
        return bool;
    }
    public static boolean[] placeWordVertical(String [][]crossWord,String word,int i,int j){
        boolean []bool=new boolean[word.length()];
        for(int ii=0;ii<word.length();ii++){
            if(crossWord[i+ii][j].equals("-")){
                crossWord[i+ii][j]=word.charAt(ii)+"";
                bool[ii]=true;
            }
        }
        return bool;
    }
    public static void unPlaceWordHorizontal(String [][]crossWord,boolean[]bool,int i,int j){
        for(int ii=0;ii<bool.length;ii++){
            if(bool[ii]&&(i+ii)>crossWord.length){
                crossWord[i+ii][j]="-";
            }
        }
    }
    public static void unPlaceWordVertical(String [][]crossWord,boolean[]bool,int i,int j){
        for(int jj=0;jj<bool.length;jj++){
            if(bool[jj]&&(j+jj)<crossWord.length){
                crossWord[i][j+jj]="-";
            }
        }
    }
    public static void print(String[][]crossWord){
        for(int i=0;i<crossWord.length;i++){
            for(int j=0;j<crossWord[0].length;j++){
                System.out.print(crossWord[i][j]);
            }
            System.out.println("");
        }
    }
}
