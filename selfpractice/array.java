package selfpractice;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int size=sc.nextInt();
    //     int numb[]=new int[size];
    //     for(int i=0;i<size;i++){
    //         numb[i]=sc.nextInt();
    //     }
    //     for(int i=0;i<size;i++){
    //         System.out.println(numb[i]);
    //     }
    // sc.close();
    // }
    Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0) {
   int size=sc.nextInt();
   int[] arr=new int[size];
 
   for(int i=0;i<size;i++) {
	   arr[i]=sc.nextInt();
	   
	   
   }
   for (int i = 0; i < size; i++) {
       int num = arr[i];
       boolean prime = true;

       if (num <= 1) {
           prime = false;
       } else {
           for (int j = 2; j * j <= num; j++) {
               if (num % j == 0) {
                   prime = false;
                   break;
               }
           }
       }


   
       if(prime) {
    	   System.out.println(arr[i]);
       }
     
   
   
   
   }
   sc.close();
}
    }
}
