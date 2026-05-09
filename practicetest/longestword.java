package practicetest;
import java.util.*;
public class longestword {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String words=sc.nextLine();
    String[] word=words.split("\s+");
    String ans="";
    for(int i=0;i<word.length;i++){
        if(word[i].length()>ans.length()){
         ans=word[i];
        }

    }
    System.out.println(ans);

  }  
}
