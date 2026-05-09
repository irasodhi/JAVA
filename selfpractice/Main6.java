 
import java.util.Scanner;
// class student{
//     public static void main(String[] ira) {
//         System.out.println("welcome to chitkara");
//     }
// }


//--------------------------------------------------------------------------------------------
// class Student{
// 	static {
// 		System.out.println("i m from student class");
// 	}
// }
// public class Demo {
// 	static {
// 		System.out.println("hi");
// 	}
// public static void main(String[] arg) {
// 	Student st =new Student();
// 	System.out.println("hello world");
// }
// }

//-----------------------------------------------------------------------------------------

// public class Demo{
// 	static double d=5.6;
// 	public static void main(String[] args){
// 		System.out.println(d);
// 	}
// }
//--------------------------------------------------------------------------------------------------
// class student2{
// 	public static void main(String arg[]){
// 	char ch='M';
// 	System.out.println(ch);
// 	char num=2;
// 	System.out.println(num);
//     char num1='2';
// 	System.out.println(num1);
// 	char c=65500;
// 	System.out.println(c);
// 	char smiley='\u263A';
// 	System.out.println(smiley);
// 	String text="I love coding \u2764";
// 	System.out.println(text);

// }
// }

// class Demo{
//     public static void main(String[] args) {
        
    
//     Scanner sc=new Scanner(System.in);
//     // char c=sc.next().charAt(0);
//     // int a=sc.nextInt();
//     // int b=sc.nextInt();
//     // int ans=0;
//     // char ans=c;
//     // if(Character.isUpperCase(c)){
//     //     ans=Character.toLowerCase(c);
//     // }
//     // System.out.println(ans);
//     // switch(c){
//     //     case '+':
//     //     ans=a+b;
//     //     break;
//     //     case '-':
//     //         ans=a-b;
//     //     break;    

 
//     // }
//     // System.out.println(ans);
//     // int n=sc.nextInt();

    
// }}


import java.util.*;

public class Main6 {

    // Function to remove duplicates
    public static Vector<Integer> removeDuplicates(Vector<Integer> v) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(v);
        return new Vector<>(set);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Vector<Integer> v = new Vector<>();

        for (int i = 0; i < n; i++) {
            v.add(sc.nextInt());
        }

        // Call function
        Vector<Integer> result = removeDuplicates(v);

        // Print result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}