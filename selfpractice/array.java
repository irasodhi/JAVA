package selfpractice;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numb[]=new int[size];
        for(int i=0;i<size;i++){
            numb[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(numb[i]);
        }
    sc.close();
    }
}
