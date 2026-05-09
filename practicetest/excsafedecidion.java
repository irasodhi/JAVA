package practicetest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excsafedecidion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int x=sc.nextInt();
            int y=sc.nextInt();
            int res=x/y;
            System.out.println(res);
        }
        catch(InputMismatchException e)
        {
         System.out.println("input mismatch");
        }
        catch(ArithmeticException e){
        System.out.println(e);
        }
    }
}
