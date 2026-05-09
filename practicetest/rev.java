package practicetest;

public class rev {
      public static String revwordstring(String s){
        StringBuilder sb=new StringBuilder();
        String[]word=s.split("\s+");
        
        for(int i=0;i<word.length;i++){
            StringBuilder rev=new StringBuilder(word[i]);
        sb.append(rev.reverse());
        sb.append(" ");
        }
        return sb.toString().trim();

      }
}
