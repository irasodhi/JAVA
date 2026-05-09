package practicetest;

public class expand {
       public static String expandString(String s) {

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                if(i+1<s.length()&&Character.isDigit(s.charAt(i+1))){
                    int freq=s.charAt(i+1)-'0';
                    for(int j=0;j<freq;j++){
                        sb.append(ch);
                    }
                    i++;

                }
                else{
                    sb.append(ch);
                }
            }
        }
        return sb.toString().trim();

    }

}
