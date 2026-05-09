
// import java.util.*;
// public class dequeue{
//     public static boolean isPallindrome(int[] arr){
//         Deque<Integer>q=new ArrayDeque<>();
//         for(int x:arr){
//             q.offer(x);
//         }
//         while(q.size()>1){
//             int front=q.removeFirst();
//             int last=q.removeLast();
//             if(front!=last){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args){
//         int[] arr={1,2,3,4,2,1};
//         System.out.println(isPallindrome(arr));
//     }
// }