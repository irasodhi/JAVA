package practicetest;

public class pellnumb {
    public void pell(int n) throws Exception{
        if(n>20){
            throw new Exception("should lie between 1 to 20");
        }
         if(n<0){
            throw new Exception("positive numb");
        }
         if(n==0){
            throw new Exception("not 0");
        }
        if(n<=10){
            long  fact=1;
            for(int i=0;i<n;i++){
                fact*=i;
            }
            System.out.println(fact);
        }
        else if(n>10){
            long a=0,b=1;
            for (int i = 1; i <= n; i++) {

                if (i == 1) {
                    System.out.print(a + " ");
                } 
                else if (i == 2) {
                    System.out.print(b + " ");
                } 
                else {
                    long c = 2 * b + a;
                    System.out.print(c + " ");
                    a = b;
                    b = c;
                }
            }

        }
    }
}
