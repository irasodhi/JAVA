package practicetest;

public class passstrength {
   public static void main(String[] args) {
    public static void validatepas(String pass){
        if(pass.length()<8){
            System.out.println("invalid pass"); 
        }
        boolean hasupper=false;
        boolean haslower=false;
        boolean hasdigit=false;
        for(char c:pass.toCharArray()){
            if(Character.isUpperCase(c))hasupper=true;
            else if(Character.isLowerCase(c))haslower=true;
            else if(Character.isDigit(c))hasdigit=true;
        }
        if(!hasupper||!haslower||!hasdigit){
            System.out.print("Inalid pass");
        }
        else{
            System.out.println("valid pass");
        }

    }
   } 
}

