

public class pro10 {
    static int i;

    public static void test() {
        System.out.println("from test() of pro 1");
    }

}
  class B extends pro10
 {
    public static void main(String []args)
    {
        System.out.println(i);
        System.out.println(B.i);
        B obj1=new B();
        obj1.test();

    }
}
