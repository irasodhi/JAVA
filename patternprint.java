//solid rectangle
// public class loop {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<n;j++){
//                 System.out.print("*");
//             }
//             System.err.println(" ");

//         }
//         sc.close();
//     }
// }
 


//hollow rectangle
// public class loop {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==1||i==n||j==1||j==n){
//                 System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.err.println(" ");

//         }
//         sc.close();
//     }
// }


//right triangle

// import java.util.Scanner;

// public class patternprint {
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println(" ");
//     }
//     sc.close();
// }
    
// }

//inverted right triangle

// import java.util.Scanner;

// public class patternprint {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=n;j>=i;j--){
//                 System.out.print("*");
//             }
//              System.out.println(" ");
//         }
       
//         sc.close();

//     }
    
// }


//pyramid

// import java.util.Scanner;

// public class patternprint {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int s=1;s<=n-i;s++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
                
            
            
//         }
//         sc.close();
//     }
// }


//palindromeno pattern
// import java.util.Scanner;

// public class patternprint {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=i;j>=1;j--){
//                 System.out.print(j);
//             }
//             for(int j=2;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
                
            
            
//         }
//         sc.close();
//     }
// }


//inverted pyramid
// import java.util.Scanner;

// public class patternprint {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int s=1;s<=n-i;s++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//         for(int i=n;i>=0;i--){
//             for(int s=1;s<=n-i;s++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
                
            
            
//         }
//         sc.close();
    
// }
// }
//pascal trinangle
// import java.util.Scanner;

// public class patternprint {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(int s=1;s<=n-i;s++){
//                 System.out.print(" ");
//             }
//             int num=1;
//             for(int j=0;j<=i;j++){
//                 System.out.print(num+" ");
//                 num=num*(i-j)/(j+1);
//             }
//             System.out.println();
                
            
            
//         }
//         sc.close();
//     }
// }
