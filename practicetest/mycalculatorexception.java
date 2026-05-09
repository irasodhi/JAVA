package practicetest;

public class mycalculatorexception {
    public long power(int n,int p)throws MyException{
        if(n<0||p<0){
           throw new MyException (" n or p should not be negative");
        }
        if(n==0&&p==0){
            throw new MyException("n and p should not be zero");

        }
        long res=1;
        for(int i=0;i<p;i++){
            res*=1;
        }
        return res;
    }
}
