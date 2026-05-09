package practicetest;

import java.util.Scanner;

public class countvac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        int c=0;
        int v=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
         if("AEIOUaeiou".indexOf(ch)!=-1){
            v++;
         }
         else{
            c++;
         }
        }
        System.out.println(v+c);
    }
}
