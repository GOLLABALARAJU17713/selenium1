interface movie    {
    void watch();
}
interface series {
    void watch2();
}
class premium implements movie
{
    public void watch(){
        System.out.println("movie");
    }
    public void series()
    {
        System.out.println("series");
    }
}


 public class inter4 {
    public static void main(String []args)
    {
        premium pre=new premium();
        pre.watch();
        pre.watch();
    }
}
