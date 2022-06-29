 class Teacher {

     void test1()
    {
        System.out.println("from () test1");
    }
}
 class std1 extends Teacher{
     void test2()
    {
        System.out.println("from class A");
    }
}
class std2 extends Teacher{
     void test3()
    {
        System.out.println("from test c");
    }

}

  public class pro11 {
    public static void  main(String []args)
     {
         std2 obj2= new std2();
         std1 obj3=new std1();
         obj2.test3();
     }


}
