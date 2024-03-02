import java.util.Scanner;
public class maxScoreOfWordProblems {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of words to be entered");
        int n=sc.nextInt();
        String words[]=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the word for i= "+i);
            words[i]=sc.next();
        }
        System.out.println("Enter the score of each alphabet");
        int score[]=new int[26];
        for(int i=0;i<26;i++){
            System.out.println("Enter the score for i= "+i);
            score[i]=sc.nextInt();
        }
        System.out.println("Enter the no. of alphabet");
        int l=sc.nextInt();
        char letter[]=new char[l];
        for(int i=0;i<l;i++){
            System.out.println("Enter the character of i= "+i);
            letter[i]=sc.next().charAt(0);
        }
        int freq[]=new int[26];
        for(int i=0;i<l;i++){
            freq[letter[i]-'a']++;
        }
        System.out.println(calculate(words,score,freq,0));

    }
    public static int calculate(String words[],int score[],int freq[],int index){
        if(index==words.length) return 0;

        int yNo=calculate(words,score,freq,index+1);//word is not included

//        if included
        String str=words[index];
        boolean flag=true;
        int count=0;
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)-'a']==0){
                flag=false;
            }
            freq[str.charAt(i)-'a']--;
            count+=score[str.charAt(i)-'a'];
        }
        int yYes=0;
        if(flag){
            yYes=count+calculate(words,score,freq,index+1);
        }
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        return Math.max(yNo,yYes);
    }
}

