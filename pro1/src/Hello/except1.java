package Hello;

public class except1 {
    public static void main(String []args)
    {
        try{
            int d=56/20;
            System.out.println("division");
        }
         catch (ArithmeticException e){
            System.out.println("error is  occured");
        }
        finally{
            System.out.println("finally rectified");
        }
    }
}
