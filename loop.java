// import java.util.Scanner;


// even odd
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a no");
//         int num=sc.nextInt();
//         if(num%2==0){
//             System.out.println(num + " is even");
//         }
//         else{
//             System.out.println(num + " is odd");
//         }
//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class loop {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter num1");
//         double a=sc.nextDouble();
//         System.out.println("enter numb2");
//         double b=sc.nextDouble();
//         System.out.println("choose +-*/");
//         char choice=sc.next().charAt(0);
//         switch (choice) {
//             case '+':
//                 System.out.println("Result"+(a+b));
//                 break;
//             case '-':
//                 System.out.println("Result"+(a-b));
//                 break;
//             case'*':
//              System.out.println("Result"+(a*b));
//               break;        
//             default:
//                 System.out.println("invalid choice");
//         }
//     sc.close();
//     }
// }


//sum of digit
// public class loop {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int s=0;
//         int temp=n;
//        while(temp!=0){
//         int digit=temp%10;
//         s+=digit;
//         temp/=10;
//        }
//        System.out.println(s);
//        sc.close();
//     }
// }
 

//reverse
// public class loop {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int rev=0;
//         while(n!=0){
//             int d=n%10;
//             rev=rev*10+d;
//             n=n/10;
//         }
//      System.out.println(rev);
//      sc.close();
//     }
// }
 

//factorial
// public class loop {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         long fact=1;
//         for(int i=1;i<n;i++){
//             fact=fact*i;
//         }
//      System.out.println(fact);
//      sc.close();
//     }
// }
 

//fabonacci
// public class loop {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a=0;
//         int b=1;
//         for(int i=1;i<=n;i++){
//         System.out.print(a+" ");
//         int c=a+b;
//         a=b;
//         b=c;
//         }
    
//      sc.close();
//     }
// }

//prime no
// public class loop {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter numb");
//         int n=sc.nextInt();
//         boolean isprime=true;
//         if(n<=1){
//           isprime=false;
//         }
//         else{
//             for(int i=2;i*i<=n;i++){
//                 if(n%i==0){
//                     isprime=false;
//                     break;
//                 }
//             }
//         }
        
//         if (isprime)
//             System.out.println(n + " is a Prime number");
//         else
//             System.out.println(n + " is NOT a Prime number");

//         sc.close();
//     }
// }


//armstrong no

import java.util.Scanner;
public class loop {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numb");
        int n=sc.nextInt();
        int temp=n;
        int d=0;
        while(temp!=0){
            d++;
            temp/=10;
        }
        temp=n;
        int s=0;
        while(temp!=0){
            int rem=temp%10;
            s+=Math.pow(rem,d);
            temp/=10;
        }
        
        if (s == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");

        sc.close();
    }
}



