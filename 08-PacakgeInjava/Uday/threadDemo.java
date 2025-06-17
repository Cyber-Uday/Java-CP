


public class threadDemo {
    public static void main(String[] args) {
        double d1=1;
        double d2=200;
        double result;
        try{
            result=d1/d2;
            if(result<0.01){
                throw new Exception("the result is less than 0.01");
            }
            System.out.println(result);
        }
           catch (Exception e) {
                // TODO: handle exception
                System.err.println(e);
            }
        
    }
}
