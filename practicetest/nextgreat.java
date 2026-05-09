package practicetest;
public class nextgreat{
    public static void main(String[] args) {
        public static String nextGreater(String num) {
       char [] arr=num.toCharArray();
       int n=arr.length;
       int i=n-2;
       while(i>=0&&arr[i]>=arr[i+1]){
        i--;
       }
       if(i<0)return "-1";
       int j=n-1;
       while(arr[j]<=arr[i]){
        j--;
       }
       char temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
       reverse(arr,i+1,n-1);
       return new String(arr);
    }
    

    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    }
}
