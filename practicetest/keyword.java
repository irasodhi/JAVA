package practicetest;

import java.util.Scanner;

public class keyword {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    String x1=sc.nextLine();
    String x2=sc.nextLine();
    String[] word=x1.split("s/+");
    int c=0;
    for(String s:word){
        if(s.equals(x2)){
            c++;
        }
    }
    System.out.println(c);
}
}
