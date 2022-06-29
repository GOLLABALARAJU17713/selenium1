interface I{
   public void test();
}
class inter1 implements I{
    public void test(){
        System.out.println("interface implemented");
    }
    public static void main(String [] args)
    {
        I obj32= new inter1();
        obj32.test();
    }
}