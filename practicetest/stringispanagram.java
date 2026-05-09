package practicetest;

public class stringispanagram {
    
class Solution {
    int isPanagram(String S) {
        // code here
       boolean[] seen=new boolean[26];
       for(char ch:S.toLowerCase().toCharArray()){
           if(ch>='a'&& ch<='z'){
               seen[ch-'a']=true;
           }
       }
           for(boolean present:seen){
               if(!present)return 0;
           }
           return 1;
       
    }
};
}
