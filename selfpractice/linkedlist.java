import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
 public static void main(String[] args) {
  LinkedList<Integer>list=new LinkedList<>();
  list.add(10);
  list.add(80);
  Iterator<Integer> it=list.descendingIterator();
  while(it.hasNext()){
    System.out.println(it.next()+" ");
  }

 } 

}
//add two num


// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//       ListNode dummy=new ListNode(0);
//       ListNode curr=dummy;
//       int carry=0;
//       while(l1!=null||l2!=null||carry!=0){
//         int sum=carry;
//         if(l1!=null){
//             sum+=l1.val;
//             l1=l1.next;

//         }
//            if(l2!=null){
//             sum+=l2.val;
//             l2=l2.next;

//         }
//         carry=sum/10;
//         curr.next=new ListNode(sum%10); ///////////
//         curr=curr.next;


//       }  
//       return dummy.next; //////////
//     }
// }






//merge two sorted list
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode dummy=new ListNode(0);
//         ListNode tail=dummy;
//         while(list1!=null&&list2!=null){      ///
//             if(list1.val<=list2.val){
//                 tail.next=list1;
//                 list1=list1.next;
//             }
//             else{
//                 tail.next=list2;
//                 list2=list2.next;
//             }
//             tail=tail.next;
//         }
//         if(list1!=null)tail.next=list1;       /////
//         if(list2!=null)tail.next=list2;
//         return dummy.next;
//     }
// }



// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         if(head==null||head.next==null)return true;
//         ListNode prev=null;
//         ListNode s=head;
//         ListNode f=head;
//         while(f!=null&&f.next!=null){
//             s=s.next;
//             f=f.next.next;
//         }
       
       
//         while(s!=null){         ////////
//            ListNode next=s.next;
//            s.next=prev;
//            prev=s;
//            s=next;        ///////////
//         }
//         ListNode first=head;
//         ListNode second =prev;
//         while(second!=null){     ///////////////
//             if(first.val!=second.val){
//                 return false;
//             }
//             first=first.next;
//             second=second.next;
//         }
//         return true;



//     }
// }