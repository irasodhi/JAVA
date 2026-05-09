package practicetest;

public class validemail {
    
    public static void isvalidemail(String id) {
    try{ 
        int acount=0;
        int dcount=0;
        int aindx=-1;
        int dindx=-1;
     for(int i=0;i<id.length();i++){
         char w=id.charAt(i);
         if(w=='@'){
            acount++;
            aindx=i;

         }
         if(w=='.'){
            dcount++;
            dindx=i;
         }


     }
     if((acount!=1||dcount!=1)){
        throw new Exception();
     }
     if(dindx<=aindx+1){
        throw new Exception();
     }
     System.out.println("Valid");
    }

catch (Exception e){
    System.out.println("error");
}


}
}
