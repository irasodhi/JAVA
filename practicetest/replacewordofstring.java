package practicetest;

public class replacewordofstring {
    public static void main(String sentence,String word1,String word2) {
        String[] words=sentence.split("\\s+");
        StringBuilder sb =new StringBuilder();
        for(String word:words){
             if (word.equalsIgnoreCase(word1)) {

                // Preserve case
                if (Character.isUpperCase(word.charAt(0))) {
                    sb.append(word2.substring(0,1).toUpperCase() + word2.substring(1));
                } else {
                    sb.append(word2.toLowerCase());
                }

            } 
            else{
                sb.append(word);
            }
            sb.append("0");

        }
        return sb.toString().trim();

    }
}
