package practicetest;

public class perfectstring {
    public static void main(String[] args) {
    public static perfectstring(int n,String w) {
      int a=0;
      int b=0;
      int x=0;
      int y=0;
      for(int i=0;i<w.length();i++){
        if(w.charAt(i)=='a'){
            a++;
        }
        else if(w.charAt(i)=='b'){
            b++;
        }
        else if(w.charAt(i)=='x'){
            x++;
        }
        else{
            y++;
        }
    }
        if((a+b)%2!=0&&(x+y)%2==0){
            return 'Yes';
        }
        else{
            return "No";
        }
      }
    
    
    }
}
