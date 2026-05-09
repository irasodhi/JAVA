package practicetest;

public class passtooshort {
    public static void main(String[] args) {
        public static void validatepass(String pass) throws Exception{
            if(pass.length()<6){
                throw new Exception("s");
            }
            boolean hasdigit=false;
            for(char c:pass.toCharArray()){
            
             if(!Character.isDigit(c)){
               hasdigit=true;
               break;
            }
            }
            if(!hasdigit){
                throw new Exception("d");
            }
           
        }
    }
}
